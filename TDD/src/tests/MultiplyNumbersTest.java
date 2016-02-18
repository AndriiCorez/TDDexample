package tests;

import org.junit.Test;
import org.junit.Assert;

import source.Calc;

public class MultiplyNumbersTest {
	
	private Calc calc = new Calc();
	
	@Test
	public void MultipyPositiveInts(){
		int expectedResult = 80;
		int actualResult = calc.Multiply(2, 40);
		Assert.assertEquals(expectedResult, actualResult);
	}
}
