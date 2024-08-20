package com.techymeet.Inheritance;

public class Employe {

	int id,age;
	String name,address;
	
    Employe(int age) {
		this.age = age;
	}
	Employe(int id,int age){
		this(age);
		this.id = id;
	}
	Employe(int id,int age,String name,String address){
		this(id,age);
		this.name = name;
		this.address = address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employe emp = new Employe(1,18,"gobi","thuraiyur"); 
     System.out.println("Id:"+emp.id+" "+"Name:"+emp.name+" "+"Age:"+emp.age+" "+"Address: "+ emp.address);
	}

}
