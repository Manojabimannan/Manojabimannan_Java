package com.techymeet.Java.Practices;


public class ReverseInteger {

	public static void main(String[] args) {

		//int []num= {1,2,3,4,5,6,7,8};
		int nums = 1234;
		int sum = 0;
		while(nums !=0) {
			int remain = nums % 10;
			sum = (sum*10)+remain;
			nums/=10;
		}
		System.out.println(sum);
	}

}
