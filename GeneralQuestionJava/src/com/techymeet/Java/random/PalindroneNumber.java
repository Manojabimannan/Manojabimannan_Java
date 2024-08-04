package com.techymeet.Java.random;

import java.util.Scanner;

public class PalindroneNumber {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int sum=0;
		while(number!=0) {
			int rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;
		}
		System.out.println(sum);
		
	}

}
