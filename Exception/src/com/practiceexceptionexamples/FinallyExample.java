package com.practiceexceptionexamples;

public class FinallyExample {

	public static void main(String[] args) {
		try
		{
			int result=100/0;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("statements gets exectued always in finally");
		}
		System.out.println("rest of the program");
	}

}
