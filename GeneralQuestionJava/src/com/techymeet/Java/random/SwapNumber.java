package com.techymeet.Java.random;

public class SwapNumber {

	public static void main(String[] args) {

		int a=55;
		int b=65;
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println(a+" "+b);
	}

}
