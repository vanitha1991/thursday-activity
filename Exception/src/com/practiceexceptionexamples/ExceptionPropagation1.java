package com.practiceexceptionexamples;

public class ExceptionPropagation1 {
	void m()
	{
		int remainder=10/0;
	}
	void n()
	{
		m();
	}
	void p()
	{
		try
		{
			n();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handling exception divide by zero");
		}
		
	}

	public static void main(String[] args) {
		ExceptionPropagation1 ep=new ExceptionPropagation1();
		ep.p();

	}

}
