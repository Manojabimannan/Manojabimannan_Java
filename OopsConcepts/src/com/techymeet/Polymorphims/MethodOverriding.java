package com.techymeet.Polymorphims;

class vechicle{
	void run() {
		System.out.println("vechilce is running");
	}
}

public class MethodOverriding extends vechicle {

	void run() {
		System.out.println("bike is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding mm = new MethodOverriding();
		mm.run();
		
	}

}
