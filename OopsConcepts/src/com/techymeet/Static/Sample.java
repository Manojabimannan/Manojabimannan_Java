package com.techymeet.Static;

class Student{
	int rollNo;
	String name;
	static String college = "Svce";
	
	Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	void display() {
		System.out.println(rollNo+" "+name+" "+college);
	}
}

public class Sample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1 = new Student(111,"gobi");
        Student s2 = new Student(121,"ragu");
        
        s1.display();
        s2.display();
	}

}
