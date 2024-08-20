package com.techymeet.abstraction;

abstract class Bike{
	abstract void run();
}

public class AbstractClass extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new AbstractClass();
		obj.run();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

}
