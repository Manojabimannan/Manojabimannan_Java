package com.techymeet.Constructor;

class Student{
	int id;
	String name;
	
	Student(int i,String n){
		id = i;
		name = n;
	}
	
	Student(Student s){
		id = s.id;
		name  = s.name;
	}
	
	void display() {
		System.out.println(id + " "+name);
	}
}

public class CopyConstructor {
     //in java there is no copy constructor , we can copy the values form one object to another like copy constructor in c++
	 //1.By constructor
	 //2.By assigning the values of one object into another.
	 //3.By clone() method of object class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(12,"gobi");
		Student s2 = new Student(s1);
		s1.display();
		s2.display();

	}

}
