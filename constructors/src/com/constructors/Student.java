package com.constructors;

public class Student {
	private String name;
	private int rollno;
	private int age;
	Student()
	{
		System.out.println("default constructor");
	}
	Student(String s,int r)
	{
		name=s;
		rollno=r;
	}
	Student(String s,int r,int a)
	{
		name=s;
		rollno=r;
		age=a;
	}
	void display()
	{
		System.out.println(name +" "+rollno+" "+age);
	}
	
	

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("sowmya",22);
		Student s3=new Student("balu",24,20);
		s1.display();
		s2.display();
		s3.display();
		
	}

}
