package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void test() {
		calculator calculatorObject = new calculator();
		float result1 = calculatorObject.divide(10, 2);
		float result2 = calculatorObject.divide(10, 3);
		float result4 = calculatorObject.divide(0, 10);
		float result5 = calculatorObject.divide(2, 5);
		assertEquals(5,result1);
		assertEquals(3,result2);
		assertEquals(0,result4);
		assertEquals(0,result5);
	}
	@Test
	public void whenDerivedExceptionThrown_thenAssertionSucceds() {
		calculator calculatorObject = new calculator();
	    Exception exception = assertThrows(RuntimeException.class, () -> {
	        calculatorObject.divide(10, 0);
	    });
	 
	    String expectedMessage = "Error can't divide by zero";
	    String actualMessage = exception.getMessage();
	 
	    assertTrue(actualMessage.contains(expectedMessage));
	}

}
