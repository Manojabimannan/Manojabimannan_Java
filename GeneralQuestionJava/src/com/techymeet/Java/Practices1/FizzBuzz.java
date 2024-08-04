package com.techymeet.Java.Practices1;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner num=new Scanner(System.in);
		int Number=num.nextInt();
		for(int i=1;i<=Number;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println(i+"FizzBuzz");
			}else if(i%3==0) {
				System.out.println(i+"Fizz");
			}
			else if(i%5==0) {
				System.out.println(i+"Buzz");
			}else {
				System.out.println(i+"WithOutFizzBuzz");
			}
		}
	}

}
