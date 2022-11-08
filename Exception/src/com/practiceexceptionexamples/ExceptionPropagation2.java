package com.practiceexceptionexamples;
import java.io.IOException;

public class ExceptionPropagation2 {
	void m() 
	{
		
		throw new IOException("IO exception occured");
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
		catch(IOException e)
		{
			System.out.println("Exception is handled");
		}
	}

	public static void main(String[] args) {
		ExceptionPropagation2 ep=new ExceptionPropagation2();
		ep.p();

	}

}
