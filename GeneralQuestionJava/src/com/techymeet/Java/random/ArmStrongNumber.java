package com.techymeet.Java.random;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num, temp, count = 0, rem, result;
		int sum=0;
		Scanner in = new Scanner(System.in);
	
		num = in.nextInt();
		int	originalNum = num;
		temp = num;
		while(temp!=0) {
			count++;
			temp=temp/10;
			
		}
		while(num!=0) {
			rem=num%10;
			sum+=(int) ( Math.pow(rem, count));
			num=num/10;
		}
		if(sum==originalNum) {
			System.out.println(originalNum+"ArmStrongNumber");
		}else {
			System.out.println(originalNum+"Not ArmStrongNumber");
		}

	}

}
