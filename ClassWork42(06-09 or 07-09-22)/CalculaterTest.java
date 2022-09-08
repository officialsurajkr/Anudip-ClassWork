package com.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName(" testing Calculator")
class CalculaterTest {
	Calculater cal;
	
	@BeforeAll
	static void beforeAllInit()
	{
		System.out.println("this will executue before all test cases");
	}
	@AfterAll
	static void afterAllInit()
	{
		System.out.println("this will executue after all test cases");
	}
	
	@BeforeEach
	void init()
	{
		cal=new Calculater();
	}
	
	@AfterEach
	void cleanUp()
	{
		cal=null;
		System.out.println("Cleaning.....");
	}

	
	
	@Test
	@DisplayName("testing subtraction ")
	void testSubtraction() 
	{
		
		assertEquals(10, cal.subtraction(15, 5),
				"this test method should test subtraction value of two number");
	}
	
	@Test
	@DisplayName("testing multiplication ")
	void testMultiplication()
	{
		assertAll(
					()-> assertEquals(4, cal.multiplication(2, 2)),
					()-> assertEquals(0, cal.multiplication(2, 0)),
					()-> assertEquals(1, cal.multiplication(2, 1))
				
				
				);
		
//		assertEquals(10, cal.multiplication(5, 2),
//				"this test method should test multiplication value of two number");
	}
	
	@Test
	@DisplayName("testing division ")
	void testDivision()
	{
		assertEquals(25, cal.division(50, 2),
				"this test method should test division value of two number");
	}
	
	@Test
	@DisplayName("testing factorial")
	@DisabledOnOs(value = {OS.MAC})
	@DisabledOnJre(value= {JRE.JAVA_18})
	@EnabledForJreRange(min = JRE.JAVA_11, max= JRE.JAVA_16)

	void testFactorial()
	{
		System.setProperty("job", "dev");
		assumeTrue("dev".equals(System.getProperty("job")),CalculaterTest::message); //we are assuming condition is true
		//if above assumption is false then rest of test will run,else abort
		assertEquals(120, cal.factorial(5),
				"this test method should test factorial  of given number");
	}
	
	
	@Nested
	@DisplayName("nested class for all add method")
	class Testaddition{
	
	@Test
	@DisplayName("testing addition ")
	@DisabledOnOs(value = {OS.LINUX,OS.WINDOWS})
	void testAddition() 
	{
		boolean f=true;
		assumeTrue(f); //we are assuming f has to be true,then test run else abort
		//if above assumption is true rest of test will run,else abort
			assertEquals(11, cal.addition(5, 6),
				"this test method should test addition value of two number");
	}
	
	
	//Testing exception
	@Test
	@DisplayName("tetsing exception")	
	void testAdditionWithException()
	{
		assertThrows(ArithmeticException.class, 
			()->	cal.additionWithException(10, 0));
	}
	
	@Test
	@DisplayName("adding two negative number")
	public void testAddTwoNegativeNo()
	{
		assertEquals(10, cal.addTwoNegativeNo(-50, -100));
	}
	
	@Test
	@DisplayName("adding two positive number")
	public void testAddTwoPositiveNo()
	{
		assertEquals(10, cal.addTwoPositiveNo(50, 100));
	}
	
	}//end of nested class
	
	//Testing of disable
	
	@Test
	@DisplayName("this method should not run")
	@Disabled
	void testDisable()
	{
		fail("this test should be disabled");
	}
	
	private static String message()
	{
		return "Test Execution is failed";
	}
	
	

}
