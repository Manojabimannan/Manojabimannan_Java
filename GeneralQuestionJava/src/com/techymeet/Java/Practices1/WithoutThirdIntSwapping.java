package com.techymeet.Java.Practices1;

public class WithoutThirdIntSwapping {

	public static void main(String[] args) {

		int a=15;
		int b=16;
		a=a+b;//15+16=31
		b=a-b;//31-16=15
		a=a-b;//31-15=16
		System.out.println("A ="+a);
		System.out.println("A ="+b);

	}

}
