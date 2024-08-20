package com.techymeet.Polymorphims;

public class MethodOverloading2 {

	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {// if we change the parameter double -> int it show the compiler error 
		                                // add method already declared & ambiguity 
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MethodOverloading2.add(10, 20));
		System.out.println(MethodOverloading2.add(10.2, 20.3));
	

	}

}
