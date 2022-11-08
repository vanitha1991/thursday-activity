package com.practiceexceptionexamples;

import java.util.Scanner;

public class ReThrowExample {
	
	void toShowException()
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,2,0,5};
		System.out.println("choose numerator and denominator position from array");
		int num=sc.nextInt();
		int denum=sc.nextInt();
		try
		{
			int remainder=arr[num]/arr[denum];
			System.out.println("result is "+remainder);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound exception");
		}
		catch(ArithmeticException e)
		{
			throw e;
		}
		System.out.println("remaining program is executed");
		
	}

	public static void main(String[] args) {
		ReThrowExample re=new ReThrowExample();
		re.toShowException();

	}

}
