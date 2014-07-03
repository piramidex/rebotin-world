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
public class RebotinolHouseTest {

	private Fraction[][] matrix;
	private RebotinolHouse house;
	
	//Common numbers
	Fraction mone = new Fraction(-1);
	Fraction zero = new Fraction(0);
	Fraction three = new Fraction(3);
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
		MultkExecution multk = new MultkExecution(3);
		SumaExecution suma = new SumaExecution();
		SumakExecution sumak = new SumakExecution(3);
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
		SumakExecution suma = new SumakExecution(2);
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
		MultkExecution mult = new MultkExecution(2);
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
	public void testEnviarAndEnviarMatriz() throws RebotinolExecutionException, RebotinolFlowException {
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
		Assert.assertArrayEquals(expected, ((MatrixMail) house.getMail()).getContent());
	}
	
	//TODO
	@Test
	public void testConditionalsPositive() throws RebotinolExecutionException, RebotinolFlowException {
		List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(1));
		MayorkExecution mayork = new MayorkExecution(subExecutions, -1);
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(1));
		MenorkExecution menork = new MenorkExecution(subExecutions, 2);
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(1));
		IgualkExecution igualk = new IgualkExecution(subExecutions, 2);
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(1));
		DiferkExecution diferk = new DiferkExecution(subExecutions, 0);
		EscriExecution escri = new EscriExecution();
		MayorExecution mayor = new MayorExecution(subExecutions);
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(1));
		MenorExecution menor = new MenorExecution(subExecutions);
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(1));
		IgualExecution igual = new IgualExecution(subExecutions);
		subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new SumakExecution(1));
		DiferExecution difer = new DiferExecution(subExecutions);
	}
}
