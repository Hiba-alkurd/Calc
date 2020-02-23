package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import calculator.Calculator;
public class CalculatorTest {

    @Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
	// Arrange
	int a = 10;
	int b = 20;
	Calculator calc = new Calculator();
	// Act
	int result = calc.sum(a, b);
	// Assert
	assertEquals(30,result);
	}

}
