package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void test() {
		calculator calculatorObject = new calculator();
		int result1 = calculatorObject.add(5,9);
		int result2 = calculatorObject.add(1,5);
		int result3 = calculatorObject.add(6,6);
		assertEquals(14,result1);
		assertEquals(6,result2);
		assertEquals(12,result3);
	}

}
