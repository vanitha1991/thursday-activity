package com.practiceexceptionexamples;

public class NestedTry {

	public static void main(String[] args) {
		try
		{
			try
			{
				int a=10/0;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("divide by zero exception");
			}
			
			try
			{
				String name=null;
				System.out.println(name.charAt(0));
			}
			catch(NullPointerException e)
			{
				System.out.println("null pointer exception");
			}
		}
		catch(Exception e)
		{
			System.out.println("exception handled by catch of outer try block");
		}
		System.out.println("rest of the code");

	}

}
