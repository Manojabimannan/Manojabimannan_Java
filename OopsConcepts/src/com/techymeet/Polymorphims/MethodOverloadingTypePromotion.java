package com.techymeet.Polymorphims;

public class MethodOverloadingTypePromotion {
	
	void sum (int a,long b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingTypePromotion mo = new MethodOverloadingTypePromotion();
		mo.sum(10, 20);// second int literal will be promoted to long.
		mo.sum(10, 20, 30);
	}

}
