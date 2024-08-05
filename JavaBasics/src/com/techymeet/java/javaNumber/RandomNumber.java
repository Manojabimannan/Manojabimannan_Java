package com.techymeet.java.javaNumber;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		Random Ran=new Random();
		int a=Ran.nextInt();
		int b=Ran.nextInt();
		System.out.println(a);
		System.out.println(b);
		Double c=Ran.nextDouble();
		Double d=Ran.nextDouble();
		System.out.println(c);
		System.out.println(d);
		long e=Ran.nextLong();
		long f=Ran.nextLong();
		System.out.println(e);
		System.out.println(f);
		float g=Ran.nextInt();
		float h=Ran.nextInt();
		System.out.println(g);
		System.out.println(h);
		
		int x=Ran.nextInt(1000);
		int y=Ran.nextInt(1000);
		System.out.println(x);
		System.out.println(y);
	}

}
