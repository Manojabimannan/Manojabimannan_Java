package com.techymeet.Java.Practices1;

import java.util.Arrays;

public class Maximum_Minimum{

	public static void main(String[] args) {

		int arr[]= {3,5,7,9,1,11,17};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(FindMAXMIN(arr)));
		
	}

	private static int[] FindMAXMIN(int[] arr) {
		
		int Max=arr[0];
		int Min=arr[1];

		for(int i=0;i<arr.length;i++) {
			if(arr[i]>Max) {
				Max=arr[i];
			}
			if(arr[i]<Min) {
				Min=arr[i];
			}
		}
		
		int [] a=new int[2];
		a[0]=Max;
		a[1]=Min;
		return a;
		
	}
}
