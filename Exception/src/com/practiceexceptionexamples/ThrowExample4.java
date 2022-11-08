package com.practiceexceptionexamples;

public class ThrowExample4 {
	static void checkNumber()
	{
		int num;
		for(num=1;num<=10;num++)
		{
			try
			{
				if(num==5)
				throw new ArithmeticException("Arithmetic Exception");
				else if(num<2)
				throw new RuntimeException("Runtime Exception");
				else if(num>9)
				throw new NullPointerException("Nullpointer Exception");
			}
			catch(ArithmeticException e)
			{
				System.out.println("exception is caught "+e);
			}
		}
	}

	public static void main(String[] args) {
		checkNumber();

	}

}
