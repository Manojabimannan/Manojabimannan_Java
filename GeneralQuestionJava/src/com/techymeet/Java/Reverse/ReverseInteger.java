package com.techymeet.Java.Reverse;

public class ReverseInteger {

	public static void main(String[] args) {

		int num=123;
		int count = 1;
		int sum = 0;
		while(num!=0) {
			if(count %2 == 0) {
				num/=10;
			}else {
			int remain = num%10;
			sum= (sum *10) + remain;
			num=num/10;
			}	
			count++;
		}
		System.out.println(sum);
	}

}
