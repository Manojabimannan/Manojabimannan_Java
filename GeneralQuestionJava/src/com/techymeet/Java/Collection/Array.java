package com.techymeet.Java.Collection;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int [] a=new int[5];//Fixed Size
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println(Arrays.toString(a));
		String []b=new String [5];
		b[0]="Abimannan";
		b[1]="BalaMurugan";
		b[2]="Chezhiyan";
		b[3]="David";
		b[4]="Elango";
		System.out.print(Arrays.toString(b));
	}
}
