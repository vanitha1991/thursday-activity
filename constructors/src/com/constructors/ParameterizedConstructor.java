package com.constructors;
class Employee
{
	int emp_id;
	String emp_name;
	Employee(int id,String name)
	{
		emp_id=id;
		emp_name=name;
		
	}
	void display()
	{
		System.out.println("Employee id and name are "+emp_id+ " "+emp_name);
	}
	
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1,"nandan");
		emp1.display();
		Employee emp2=new Employee(5,"avinash");
		emp2.display();

	}

}
