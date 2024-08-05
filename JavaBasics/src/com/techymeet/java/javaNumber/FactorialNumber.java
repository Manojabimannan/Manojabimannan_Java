package com.techymeet.java.javaNumber;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		int num=in.nextInt();
		int Factorial = 1;
		for(int i=1;i<=num;i++) {
			Factorial=Factorial*i;
		}
		System.out.println(Factorial);
	}

}
