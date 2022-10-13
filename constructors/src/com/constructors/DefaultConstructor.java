package com.constructors;
class Dog
{
	String name;
	int noOfLegs;
	/*Dog()
	{
		System.out.println("this is a default constructor");
	}*/
	void display()
	{
		System.out.println(name+ " "+noOfLegs);
	}
	
}

public class DefaultConstructor {

	public static void main(String[] args) {
		Dog dobj1=new Dog();
		Dog dobj2=new Dog();
		dobj1.display();
		dobj2.display();
		
	}

}
