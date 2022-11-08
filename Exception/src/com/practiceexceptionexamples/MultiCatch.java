package com.practiceexceptionexamples;

public class MultiCatch {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			//a[5]=100/0;
			System.out.println(a[10]);
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		System.out.println("Rest of the program");

	}

}
