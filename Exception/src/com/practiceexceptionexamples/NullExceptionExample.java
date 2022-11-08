package com.practiceexceptionexamples;

public class NullExceptionExample {

	public static void main(String[] args) {
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		/*catch(NullPointerException e)
		{
			System.out.println("null pointer exception");
		}*/
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("null pointer exception");
		}
		
		
	System.out.println("rest of the code");
	}

}
