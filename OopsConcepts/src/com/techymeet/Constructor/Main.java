package com.techymeet.Constructor;

import java.util.Scanner;

class Test1{
	int i;
	String name;
	
	public Test1(int k) {
		i = k;
	}
	
	public Test1(int k,int m) {
		System.out.println("Hi I am gobi");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println(name);
		if(k>m) {
			i = k;
		}
		else {
			i = m;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Test1 test1 = new Test1(10);
		Test1 test2 = new Test1(12,15);
		
		System.out.println(test1.i);
		System.out.println(test2.i);
		
	}
}
