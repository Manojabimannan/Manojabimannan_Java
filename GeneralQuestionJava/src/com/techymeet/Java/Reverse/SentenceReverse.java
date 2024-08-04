package com.techymeet.Java.Reverse;

import java.util.Scanner;

public class SentenceReverse {

	public static void main(String [] args) {
		Scanner in =new Scanner(System.in);
		String Word=in.nextLine();
		String [] arr=Word.split(" ");
		String Temp=" ";
		for(int i=arr.length-1;i>=0;i--) {
			Temp=Temp+arr[i];
		}
		System.out.println("Before"+Word+ " ");
		System.out.println("After"+Temp+ " ");
		in.close();
	}
}
