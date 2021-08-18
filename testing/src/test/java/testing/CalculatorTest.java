package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeEach
	public void  init()
	{
		calculator=new Calculator();
	}
	
	@Test
	void testAdd()
	{
		
		int result= calculator.add(1,3);
		assertEquals(4,result);
	}
	
	@Test
	void testMinius()
	{
		 
		double result= calculator.minius(5,2);
		assertEquals(3,result);
	}
	
	@Test
	void testDivide()
	{
		
		double result= calculator.divide(10,5);
		assertEquals(2,result);
	}
	

}
