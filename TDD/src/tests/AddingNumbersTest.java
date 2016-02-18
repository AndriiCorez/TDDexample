package tests;

import org.junit.Test;
import org.junit.Assert;

import source.Calc;

public class AddingNumbersTest {
	
	private Calc calc = new Calc();
	
	@Test
	public void addTwoPositiveNumbers()
	{
		int expectedResult = 30;
		int ActuaResult = calc.Add(10, 20);
		Assert.assertEquals("The the sum of two positive numbers is correct" , expectedResult, ActuaResult);	
	}
 
	@Test
	public void addTwoNegativeNumbers()
	{
		int expectedResult = -30;
		int ActuaResult = calc.Add(-10, -20);
		Assert.assertEquals("The the sum of two negative numbers is correct" , expectedResult, ActuaResult);	
	}
}
