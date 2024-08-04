package com.techymeet.Java.Practices1;

import java.util.Arrays;


public class Sorting {

	public static void main(String[] args) {

		int a[]= {2,6,100,55,12,7,64,88,17};
		System.out.println(Arrays.toString(a));
		int temp;
		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {  //if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));

	}
	
}
