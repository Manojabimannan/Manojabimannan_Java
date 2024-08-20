package com.techymeet.Polymorphims;

public class MethodOverloading1 {
	// 1. changing no of arguments 
	
	static int add(int a ,int b) {
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(MethodOverloading1.add(10, 20));
       System.out.println(MethodOverloading1.add(10, 20,30));
	}

}
