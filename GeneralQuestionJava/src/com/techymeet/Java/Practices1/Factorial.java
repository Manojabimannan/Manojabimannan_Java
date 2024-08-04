package com.techymeet.Java.Practices1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[]main) {
		System.out.println("Enter The Number");
		int Factorial=1;
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int  num=in.nextInt();
		for(int i=1;i<=num;i++) {
			Factorial=i*Factorial;
		}
		System.out.println(Factorial);
	}
}
