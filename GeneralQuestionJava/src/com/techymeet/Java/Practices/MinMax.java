package com.techymeet.Java.Practices;

import java.util.Arrays;

public class MinMax {
	public static void main(String[] args) {
		int [] number= {2,4,12,55,66,18,14};
		System.out.println(Arrays.toString(MaxMinFind(number)));
	}

	private static int[] MaxMinFind(int[] number) {

		
		
		if(number==null || number.length==0) {
			
		}
		
		int max=number[0];
		int min=number[0];
		for(int i=0;i<number.length;i++) {
		if(number[i]>max) {
			max=number[i];
		}
		if(number[i]<min) {
			min=number[i];
		}
		
		}
		int a []=new int[2];
		a[0]=max;
		a[1]=min;
		return a;
		
	}

	

}
