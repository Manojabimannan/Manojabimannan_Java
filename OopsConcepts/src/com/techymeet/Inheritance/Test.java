package com.techymeet.Inheritance;

class Person{
	String name ,address;
	int age;
	Person(String name,String address,int age){
		this.name = name;
		this.address = address;
		this.age = age;
	}
}

class Employee1 extends Person{

	float salary;
	Employee1(String name, String address, int age,float salary) {
		super(name, address, age);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	
}
public class Test {

	public static void main(String[] args) {
		Employee1 e = new Employee1("gobi","chennai",22,10000);
		System.out.println(e.name+" "+e.address+" "+e.age+" "+e.salary);
	}
}
