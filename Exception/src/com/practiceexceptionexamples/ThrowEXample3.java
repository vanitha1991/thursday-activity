package com.practiceexceptionexamples;

public class ThrowEXample3 {
	static void check()
	{
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println("result"+c);
			throw new ArithmeticException();
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception is caught "+e);
		}
		
	}

	public static void main(String[] args) 
	{
		check();

	}

}
