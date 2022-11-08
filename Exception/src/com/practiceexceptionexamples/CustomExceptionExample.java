package com.practiceexceptionexamples;

class MyFirstException extends Exception
{
	MyFirstException()
	{
		//super(s);
	}
	
}
public class CustomExceptionExample {

	public static void main(String[] args) {
		try
		{
			throw new MyFirstException();
		}
		catch(MyFirstException e)
		{
			System.out.println("exception is caught");
		}

	}

}
