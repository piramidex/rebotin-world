package edu.upb.lp.rebotinol.model.executions;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import edu.upb.lp.rebotinol.model.house.FractionMail;
import edu.upb.lp.rebotinol.model.house.MatrixMail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.MatrixUtil;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

@RunWith(JUnit4.class)
public class RebotinolExecutionsTest {

	private Fraction[][] matrix;
	private RebotinolHouse house;

	// Common numbers
	Fraction mone = new Fraction(-1);
	Fraction zero = new Fraction(0);
	Fraction one= new Fraction(1);
	Fraction two = new Fraction(2);
	Fraction three = new Fraction(3);
	Fraction six = new Fraction(6);
	Fraction nine = new Fraction(9);
	Fraction twentyseven = new Fraction(27);
	Fraction mtwentyseven = new Fraction(-27);
	Fraction monetwentyseven = new Fraction(-1, 27);

	@Before
	public void setup() {
		if (matrix == null) {
			matrix = MatrixUtil.createMatrix(5, 5);
		}
		try {
			house = new RebotinolHouse(matrix);
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
	}

	@Test
	public void testMovements() throws RebotinolExecutionException,
			RebotinolFlowException {
		AbaExecution aba = new AbaExecution();
		DerExecution der = new DerExecution();
		ArrExecution arr = new ArrExecution();
		IzqExecution izq = new IzqExecution();
		Assert.assertFalse(aba.isFinished());
		Assert.assertFalse(der.isFinished());
		Assert.assertFalse(arr.isFinished());
		Assert.assertFalse(izq.isFinished());
		int h = house.getPositionH();
		int v = house.getPositionV();
		// Aba
		aba.step(house);
		int newH = house.getPositionH();
		int newV = house.getPositionV();
		Assert.assertEquals(h, newH);
		Assert.assertEquals(v + 1, newV);
		// Der
		der.step(house);
		newH = house.getPositionH();
		newV = house.getPositionV();
		Assert.assertEquals(h + 1, newH);
		Assert.assertEquals(v + 1, newV);
		// Arr
		arr.step(house);
		newH = house.getPositionH();
		newV = house.getPositionV();
		Assert.assertEquals(h + 1, newH);
		Assert.assertEquals(v, newV);
		// Izq
		izq.step(house);
		newH = house.getPositionH();
		newV = house.getPositionV();
		Assert.assertEquals(h, newH);
		Assert.assertEquals(v, newV);
		// Finished and started
		Assert.assertTrue(aba.isFinished());
		Assert.assertTrue(der.isFinished());
		Assert.assertTrue(arr.isFinished());
		Assert.assertTrue(izq.isFinished());
		Assert.assertTrue(aba.isStarted());
		Assert.assertTrue(der.isStarted());
		Assert.assertTrue(arr.isStarted());
		Assert.assertTrue(izq.isStarted());
		// Rollback
		// Izq
		izq.stepBack(house);
		newH = house.getPositionH();
		newV = house.getPositionV();
		Assert.assertEquals(h + 1, newH);
		Assert.assertEquals(v, newV);
		// Arr
		arr.stepBack(house);
		newH = house.getPositionH();
		newV = house.getPositionV();
		Assert.assertEquals(h + 1, newH);
		Assert.assertEquals(v + 1, newV);
		// Der
		der.stepBack(house);
		newH = house.getPositionH();
		newV = house.getPositionV();
		Assert.assertEquals(h, newH);
		Assert.assertEquals(v + 1, newV);
		// Aba
		aba.stepBack(house);
		newH = house.getPositionH();
		newV = house.getPositionV();
		Assert.assertEquals(h, newH);
		Assert.assertEquals(v, newV);
		// Not started, not finished
		Assert.assertFalse(aba.isFinished());
		Assert.assertFalse(der.isFinished());
		Assert.assertFalse(arr.isFinished());
		Assert.assertFalse(izq.isFinished());
		Assert.assertFalse(aba.isStarted());
		Assert.assertFalse(der.isStarted());
		Assert.assertFalse(arr.isStarted());
		Assert.assertFalse(izq.isStarted());
		// Unchanging movements
		arr.step(house);
		newH = house.getPositionH();
		newV = house.getPositionV();
		Assert.assertEquals(h, newH);
		Assert.assertEquals(v, newV);
		izq.step(house);
		newH = house.getPositionH();
		newV = house.getPositionV();
		Assert.assertEquals(h, newH);
		Assert.assertEquals(v, newV);
	}

	@Test
	public void testMemoryAndEscri() throws RebotinolExecutionException,
			RebotinolFlowException {
		InverExecution inver = new InverExecution();
		MemoExecution memo = new MemoExecution();
		MultExecution mult = new MultExecution();
		MultkExecution multk = new MultkExecution(three);
		SumaExecution suma = new SumaExecution();
		SumakExecution sumak = new SumakExecution(three);
		SignoExecution signo = new SignoExecution();
		EscriExecution escri = new EscriExecution();

		memo.step(house);
		Assert.assertEquals(zero, house.getMemory());
		sumak.step(house);
		Assert.assertEquals(three, house.getMemory());
		suma.step(house); // adding zero
		Assert.assertEquals(three, house.getMemory());
		escri.step(house);
		Assert.assertEquals(three, house.getCurrentMatrixValue());
		multk.step(house);
		Assert.assertEquals(nine, house.getMemory());
		mult.step(house);
		Assert.assertEquals(twentyseven, house.getMemory());
		signo.step(house);
		Assert.assertEquals(mtwentyseven, house.getMemory());
		inver.step(house);
		Assert.assertEquals(monetwentyseven, house.getMemory());
		// Finished and started
		Assert.assertTrue(inver.isStarted());
		Assert.assertTrue(memo.isStarted());
		Assert.assertTrue(mult.isStarted());
		Assert.assertTrue(multk.isStarted());
		Assert.assertTrue(suma.isStarted());
		Assert.assertTrue(sumak.isStarted());
		Assert.assertTrue(signo.isStarted());
		Assert.assertTrue(escri.isStarted());
		Assert.assertTrue(inver.isFinished());
		Assert.assertTrue(memo.isFinished());
		Assert.assertTrue(mult.isFinished());
		Assert.assertTrue(multk.isFinished());
		Assert.assertTrue(suma.isFinished());
		Assert.assertTrue(sumak.isFinished());
		Assert.assertTrue(signo.isFinished());
		Assert.assertTrue(escri.isFinished());

	}

	@Test(expected = RebotinolExecutionException.class)
	public void testSumaException() throws RebotinolExecutionException,
			RebotinolFlowException {
		SumaExecution suma = new SumaExecution();
		suma.step(house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testSumakException() throws RebotinolExecutionException,
			RebotinolFlowException {
		SumakExecution suma = new SumakExecution(two);
		suma.step(house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testMultException() throws RebotinolExecutionException,
			RebotinolFlowException {
		MultExecution mult = new MultExecution();
		mult.step(house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testMultkException() throws RebotinolExecutionException,
			RebotinolFlowException {
		MultkExecution mult = new MultkExecution(two);
		mult.step(house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testInverException() throws RebotinolExecutionException,
			RebotinolFlowException {
		InverExecution inver = new InverExecution();
		inver.step(house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testSignoException() throws RebotinolExecutionException,
			RebotinolFlowException {
		SignoExecution signo = new SignoExecution();
		signo.step(house);
	}

	@Test
	public void testEnviarAndEnviarMatriz() throws RebotinolExecutionException,
			RebotinolFlowException {
		MemoExecution memo = new MemoExecution();
		EnviarExecution enviar = new EnviarExecution();
		EnviarMatrizExecution enviarMatriz = new EnviarMatrizExecution();

		memo.step(house);
		enviar.step(house);
		Assert.assertTrue(house.getMail() instanceof FractionMail);
		Assert.assertEquals(zero, ((FractionMail) house.getMail()).getContent());
		enviarMatriz.step(house);
		Fraction[][] expected = MatrixUtil.createMatrix(5, 5);
		Assert.assertTrue(house.getMail() instanceof MatrixMail);
		Assert.assertArrayEquals(expected,
				((MatrixMail) house.getMail()).getContent());
	}

	@Test
	public void testConditionalsPositive() throws RebotinolExecutionException,
			RebotinolFlowException {
		house.writeInMatrix(1,0,three);
		house.writeInMatrix(2,0,six);
		// Memo, memo: 0
		MemoExecution memo = new MemoExecution();
		// Mayor -1,, memo: 0
		List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		MayorkExecution mayork = new MayorkExecution(subExecutions, mone);
		// Menor 2, memo: 1
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		MenorkExecution menork = new MenorkExecution(subExecutions, two);
		// Igual 2, memo: 2
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		IgualkExecution igualk = new IgualkExecution(subExecutions, two);
		// Difer 2, memo: 3
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		DiferkExecution diferk = new DiferkExecution(subExecutions, zero);
		// Der, memo: 4
		DerExecution der = new DerExecution();
		// Mayor, memo: 4
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		MayorExecution mayor = new MayorExecution(subExecutions);
		// Der, memo: 5
		DerExecution der2 = new DerExecution();
		// Menor, memo: 5
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		MenorExecution menor = new MenorExecution(subExecutions);
		// Igual, memo: 6
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		IgualExecution igual = new IgualExecution(subExecutions);
		// Difer, memo: 7
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		DiferExecution difer = new DiferExecution(subExecutions);
		//Program
		List<RebotinolInstructionExecution> executions = new ArrayList<RebotinolInstructionExecution>();
		executions.add(memo);
		executions.add(mayork);
		executions.add(menork);
		executions.add(igualk);
		executions.add(diferk);
		executions.add(der);
		executions.add(mayor);
		executions.add(der2);
		executions.add(menor);
		executions.add(igual);
		executions.add(difer);
		RebotinolProgram program = new RebotinolProgram(executions);
		while (!program.isFinished()) {
			program.step(house);
		}
		Assert.assertEquals(new Fraction(8), house.getMemory());
	}
	
	@Test
	public void testConditionalsNegative() throws RebotinolExecutionException,
			RebotinolFlowException {
		house.writeInMatrix(1,0,one);
		// Memo, memo: 0
		MemoExecution memo = new MemoExecution();
		// Mayor 0, memo: 0
		List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		MayorkExecution mayork = new MayorkExecution(subExecutions, zero);
		// Menor 0, memo: 0
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		MenorkExecution menork = new MenorkExecution(subExecutions, zero);
		// Igual 1, memo: 0
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		IgualkExecution igualk = new IgualkExecution(subExecutions, one);
		// Difer 0, memo: 0
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		DiferkExecution diferk = new DiferkExecution(subExecutions, zero);
		// Mayor, memo: 0
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		MayorExecution mayor = new MayorExecution(subExecutions);
		// Menor, memo: 0
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		MenorExecution menor = new MenorExecution(subExecutions);
		// Der, memo 0
		DerExecution der = new DerExecution();
		// Igual, memo: 0
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		IgualExecution igual = new IgualExecution(subExecutions);
		//Izq, memo 0
		IzqExecution izq = new IzqExecution();
		// Difer, memo: 0
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(one));
		DiferExecution difer = new DiferExecution(subExecutions);
		//Program
		List<RebotinolInstructionExecution> executions = new ArrayList<RebotinolInstructionExecution>();
		executions.add(memo);
		executions.add(mayork);
		executions.add(menork);
		executions.add(igualk);
		executions.add(diferk);
		executions.add(mayor);
		executions.add(menor);
		executions.add(der);
		executions.add(igual);
		executions.add(izq);
		executions.add(difer);
		RebotinolProgram program = new RebotinolProgram(executions);
		while (!program.isFinished()) {
			program.step(house);
		}
		Assert.assertEquals(new Fraction(0), house.getMemory());
	}
}
