package com.techymeet.java.javaNumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		int number=29;
		Boolean isprime=true;
		for(int i=2;i <=number/2;i++) {
			if(number%2==0) {
				isprime=false;
			}
		}
		System.out.println(" "
				+ "");
		if(isprime&&number>1) {
			System.out.println(number+"PrimeNumber");
		}else {
			System.out.println(number+"Not a PrimeNumber");
		}
		
	}

}
