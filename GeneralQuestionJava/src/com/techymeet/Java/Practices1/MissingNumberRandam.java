package com.techymeet.Java.Practices1;

import java.util.Arrays;

public class MissingNumberRandam {

	public static void main(String[] args) {

		int [] arr= {2,5,6,1,8,2,9};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(MissingNumber(arr)));
	}

	private static int[] MissingNumber(int[] arr) {
		int StartIndex=1;
		int EndIndex=10;
		int arrIndex=0;
		for(int i=StartIndex;i<=EndIndex;i++) {
			if(arrIndex<arr[i]&&arr[arrIndex]==i) {
				arrIndex++;
			}else {
				System.out.println("Enter The Number"+i);
			}
		}
		
		return arr;
	}

}
