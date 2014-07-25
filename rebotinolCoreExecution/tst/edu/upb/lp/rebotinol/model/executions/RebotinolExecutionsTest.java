package edu.upb.lp.rebotinol.model.executions;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.MatrixUtil;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

@RunWith(JUnit4.class)
public class RebotinolExecutionsTest {

	private Fraction[][] _matrix;
	private RebotinolHouse _house;

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
		if (_matrix == null) {
			_matrix = MatrixUtil.createMatrix(5, 5);
		}
		try {
			_house = new RebotinolHouse(_matrix);
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
	}

	@Test
	public void testMovements() throws RebotinolExecutionException,
			RebotinolFlowException, RebotinolFatalException {
		AbaExecution aba = new AbaExecution();
		DerExecution der = new DerExecution();
		ArrExecution arr = new ArrExecution();
		IzqExecution izq = new IzqExecution();
		Assert.assertFalse(aba.isFinished());
		Assert.assertFalse(der.isFinished());
		Assert.assertFalse(arr.isFinished());
		Assert.assertFalse(izq.isFinished());
		int h = _house.getPositionH();
		int v = _house.getPositionV();
		// Aba
		aba.step(_house);
		int newH = _house.getPositionH();
		int newV = _house.getPositionV();
		Assert.assertEquals(h, newH);
		Assert.assertEquals(v + 1, newV);
		// Der
		der.step(_house);
		newH = _house.getPositionH();
		newV = _house.getPositionV();
		Assert.assertEquals(h + 1, newH);
		Assert.assertEquals(v + 1, newV);
		// Arr
		arr.step(_house);
		newH = _house.getPositionH();
		newV = _house.getPositionV();
		Assert.assertEquals(h + 1, newH);
		Assert.assertEquals(v, newV);
		// Izq
		izq.step(_house);
		newH = _house.getPositionH();
		newV = _house.getPositionV();
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
		izq.stepBack(_house);
		newH = _house.getPositionH();
		newV = _house.getPositionV();
		Assert.assertEquals(h + 1, newH);
		Assert.assertEquals(v, newV);
		// Arr
		arr.stepBack(_house);
		newH = _house.getPositionH();
		newV = _house.getPositionV();
		Assert.assertEquals(h + 1, newH);
		Assert.assertEquals(v + 1, newV);
		// Der
		der.stepBack(_house);
		newH = _house.getPositionH();
		newV = _house.getPositionV();
		Assert.assertEquals(h, newH);
		Assert.assertEquals(v + 1, newV);
		// Aba
		aba.stepBack(_house);
		newH = _house.getPositionH();
		newV = _house.getPositionV();
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
		arr.step(_house);
		newH = _house.getPositionH();
		newV = _house.getPositionV();
		Assert.assertEquals(h, newH);
		Assert.assertEquals(v, newV);
		izq.step(_house);
		newH = _house.getPositionH();
		newV = _house.getPositionV();
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

		memo.step(_house);
		Assert.assertEquals(zero, _house.getMemory());
		sumak.step(_house);
		Assert.assertEquals(three, _house.getMemory());
		suma.step(_house); // adding zero
		Assert.assertEquals(three, _house.getMemory());
		escri.step(_house);
		Assert.assertEquals(three, _house.getCurrentMatrixValue());
		multk.step(_house);
		Assert.assertEquals(nine, _house.getMemory());
		mult.step(_house);
		Assert.assertEquals(twentyseven, _house.getMemory());
		signo.step(_house);
		Assert.assertEquals(mtwentyseven, _house.getMemory());
		inver.step(_house);
		Assert.assertEquals(monetwentyseven, _house.getMemory());
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
		suma.step(_house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testSumakException() throws RebotinolExecutionException,
			RebotinolFlowException {
		SumakExecution suma = new SumakExecution(two);
		suma.step(_house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testMultException() throws RebotinolExecutionException,
			RebotinolFlowException {
		MultExecution mult = new MultExecution();
		mult.step(_house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testMultkException() throws RebotinolExecutionException,
			RebotinolFlowException {
		MultkExecution mult = new MultkExecution(two);
		mult.step(_house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testInverException() throws RebotinolExecutionException,
			RebotinolFlowException {
		InverExecution inver = new InverExecution();
		inver.step(_house);
	}

	@Test(expected = RebotinolExecutionException.class)
	public void testSignoException() throws RebotinolExecutionException,
			RebotinolFlowException {
		SignoExecution signo = new SignoExecution();
		signo.step(_house);
	}

	@Test
	public void testEnviarAndEnviarMatriz() throws RebotinolExecutionException,
			RebotinolFlowException {
		MemoExecution memo = new MemoExecution();
		EnviarExecution enviar = new EnviarExecution();
		EnviarMatrizExecution enviarMatriz = new EnviarMatrizExecution();

		memo.step(_house);
		enviar.step(_house);
		Assert.assertTrue(_house.getMail() instanceof Mail);
		Assert.assertEquals(zero, ((Mail) _house.getMail()).getContent());
		enviarMatriz.step(_house);
		Assert.assertTrue(_house.isMatrixSent());
	}

	@Test
	public void testConditionalsPositive() throws RebotinolExecutionException,
			RebotinolFlowException, RebotinolFatalException {
		_house.writeInMatrix(1,0,three);
		_house.writeInMatrix(2,0,six);
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
			program.step(_house);
		}
		Assert.assertEquals(new Fraction(8), _house.getMemory());
		while(program.isStarted()) {
			program.stepBack(_house);
		}
		Assert.assertNull(_house.getMemory());
	}
	
	@Test
	public void testConditionalsNegative() throws RebotinolExecutionException,
			RebotinolFlowException, RebotinolFatalException {
		_house.writeInMatrix(1,0,one);
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
			program.step(_house);
		}
		Assert.assertEquals(zero, _house.getMemory());
		while(program.isStarted()) {
			program.stepBack(_house);
		}
		Assert.assertNull(_house.getMemory());
	}
	
	@Test
	public void testRep() throws RebotinolExecutionException, RebotinolFlowException, RebotinolFatalException {
		//Matrix: 0, 1, 2, 3, result: 6
		_house.writeInMatrix(1,0,one);
		_house.writeInMatrix(2,0,two);
		_house.writeInMatrix(3,0,three);
		MemoExecution memo = new MemoExecution();
		List<RebotinolInstructionExecution> repExecutions = new ArrayList<RebotinolInstructionExecution>();
		for (int i = 0; i<3; i++) {
			repExecutions.add(new DerExecution());
			repExecutions.add(new SumaExecution());
		}
		RepExecution rep = new RepExecution(repExecutions, 3);
		
		List<RebotinolInstructionExecution> executions = new ArrayList<RebotinolInstructionExecution>();
		executions.add(memo);
		executions.add(rep);
		RebotinolProgram program = new RebotinolProgram(executions);
		while (!program.isFinished()) {
			program.step(_house);
		}
		Assert.assertEquals(six, _house.getMemory());
		
		while(program.isStarted()) {
			program.stepBack(_house);
		}
		Assert.assertNull(_house.getMemory());
	}
	
	@Test
	public void testReducedFractions() throws RebotinolExecutionException {
		SumakExecution suma = new SumakExecution(new Fraction(1,3));
		_house.setMemory(new Fraction(2,3));
		suma.doStep(_house);
		Assert.assertEquals(new Fraction(1),_house.getMemory());
		Assert.assertEquals(1, _house.getMemory().getDenominator());
		_house.setMemory(new Fraction(1,2));
		MultkExecution mult = new MultkExecution(new Fraction(2));
		mult.doStep(_house);
		Assert.assertEquals(new Fraction(1),_house.getMemory());
		Assert.assertEquals(1, _house.getMemory().getDenominator());
	}
}
