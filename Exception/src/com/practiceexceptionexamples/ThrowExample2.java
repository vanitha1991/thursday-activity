package com.practiceexceptionexamples;

public class ThrowExample2 {
	static void fun()
	{
		try
		{
			
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("caught inside fun()");
		}
	}

	public static void main(String[] args) {
		fun();

	}

}
