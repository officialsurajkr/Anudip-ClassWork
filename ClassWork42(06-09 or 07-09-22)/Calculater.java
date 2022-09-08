package com.test;

	public class Calculater 
	{
		public int addition( int a, int b)
		{
			return a+b;
		}
	public int subtraction( int a, int b)
	{
		return a-b;
	}

	public int multiplication(int a, int b)
	{
		return a*b;
	}
	
	public int division(int a, int b)
	{
		return a/b;
	}
	
	public int factorial(int n)
	{
		int i, f=1;
		for( i=1; i<=n; i++)
		{
			f*=i;
		}
		return f;
	}
	
	public void additionWithException(int a, int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	
	public int addTwoNegativeNo(int a, int b)
	{
		return a+b;
	}
	
	public int addTwoPositiveNo(int a, int b)
	{
		return a+b;
	}
}
