package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	private final Calculator calculadora= new Calculator();
	@Test
	void additions(){
		assertEquals(8,calculadora.addNumbers(5,3));
	}
	@Test
	void additionsNeg(){
		assertEquals(-2,calculadora.addNumbers(-5,3));
	}
	
	
	@Test
	void substract(){
		assertEquals(2,calculadora.subtractNumbers(5,3));
	}
	@Test
	void divicion(){
		assertEquals(1,calculadora.divideNumbers(5,3));
	}
	@Test
	void multiplicacion(){
		assertEquals(15,calculadora.multiplyNumbers(5,3));
	}
}
