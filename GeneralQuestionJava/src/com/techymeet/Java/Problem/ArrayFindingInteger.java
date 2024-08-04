package com.techymeet.Java.Problem;

public class ArrayFindingInteger {

	public static void main(String[] args) {

		int[] nums1 = { 2, 6, 4 };
		int[] nums2 = { 9, 7, 5 };
		System.out.println(AddInteger(nums1, nums2));

	}

	private static int AddInteger(int[] nums1, int[] nums2) {

	
		int min=Integer.MAX_VALUE;
		int min1=Integer.MAX_VALUE;
		for(int i=0;i<nums1.length;i++) {
			min=Math.min(min, nums1[i]);
			min1=Math.min(min, nums2[i]);
			
			
		}
		return min1-min;
		
	}
	
	}
