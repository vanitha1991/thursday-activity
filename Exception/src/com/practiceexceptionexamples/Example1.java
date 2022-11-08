package com.practiceexceptionexamples;

public class Example1 {

	public static void main(String[] args) {
		
		//int remainder=100/0;
		
		//System.out.println("remaining code of program");
		int a=100,b=0;
		try {
		int remainder=a/b;
		//System.out.println("remaining code of program");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("remaining code of program by finally");
		}
		System.out.println("remaining code");
			
		}

}
