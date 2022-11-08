package com.practiceexceptionexamples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

class Sample
{
	void display() throws IOException
	{
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.println("hello");
		System.out.println("file not found");
		//throw new IOException("IOException occured inside display()");
	}
	void display1() throws ClassNotFoundException
	{
		//some code 
		
	}
}

public class ThrowsExample2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		Sample s=new Sample();
		s.display();
		
		Sample s1=new Sample();
		s1.display1();
		/*try {
			s1.display1();
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}*/
		System.out.println("remaining code");
	}
	

}
