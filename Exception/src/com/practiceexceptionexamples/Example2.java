package com.practiceexceptionexamples;

public class Example2 {

	public static void main(String[] args) {
		try
		{
			
	      int arr[]= {10,20,30,40,50};
	      System.out.println(arr[10]);

	}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the program");

}
}
