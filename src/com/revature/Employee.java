package com.revature;

public class Employee {
	static float i=4;
	static float j=4;
	 
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

public static void main(String[] args) {
	double z= (i+j);
	System.out.println(z);
	Employee[] emp=new Employee[5];
	emp[0]=new Employee(1,"nithya");
	emp[1]=new Employee(2,"irine");
	emp[2]=new Employee(3,"bar");
	System.out.println(emp[0]);
	System.out.println(emp[1]);
	System.out.println(emp[2]);
}
}
