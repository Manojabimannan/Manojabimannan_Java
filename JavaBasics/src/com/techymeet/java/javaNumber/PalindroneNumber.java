package com.techymeet.java.javaNumber;

import java.util.Scanner;

public class PalindroneNumber {

	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		int num=in.nextInt();
		int sum=0;
		int rem;
		while(num!=0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
