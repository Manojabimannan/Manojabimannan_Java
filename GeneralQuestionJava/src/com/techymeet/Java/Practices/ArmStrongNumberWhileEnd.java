package com.techymeet.Java.Practices;

public class ArmStrongNumberWhileEnd {

	public static void main(String[] args) {

		int number,Count = 0,result,rem,sum=0,num;
	num=number=1634;
	
		int temp=number;
		while(temp!=0) {
			Count++;
			temp=temp/10;		
		}
		while(number!=0) {
			rem=number%10;
			sum+=(Math.pow(rem, Count));
			number=number/10;
		}
		if(sum == num) {
		System.out.println(num+"ArmStrongNumber");
		}
	}

}
