package tests;

import org.junit.Test;
import org.junit.Assert;

import source.Calc;

public class SubstractNumbersTest {
	
	private Calc calc = new Calc();
	
	@Test
	public void SubstractPositiveNumbers(){
		int expectedResult = 30;
		int actualResult = calc.Substract(50, 20);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
}
