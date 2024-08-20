package com.techymeet.Inheritance;

public class Employee {

	int id;
	String name;
	Address address;
	
	Employee(int id,String name,Address address){
      this.id = id;
      this.name = name;
      this.address = address;
	}
	
	void display() {
		System.out.println(id +" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address1 = new Address("chennai","Tn","india");
		Address address2 = new Address("bangalore","Kar","india");
		
		Employee e1 = new Employee(111,"gobi",address1);
		Employee e2 = new Employee(121,"ragu",address2);
		e1.display();
		e2.display();
	}

}
