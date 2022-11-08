package com.practiceexceptionexamples;

public class ThrowExample1 {
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("you are not eligible for voting");
		}
		else
		{
			System.out.println("you are eligibe for voting");
		}
		
		System.out.println("proceed with voting");
	}

	public static void main(String[] args) {
		checkAge(16);
		

	}

}
