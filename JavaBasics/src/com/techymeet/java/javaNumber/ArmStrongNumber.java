package com.techymeet.java.javaNumber;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int sum = 0,num = 153,count = 0,temp,rem;
		temp=num;
		int OriginalNumber=num;
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
		while(num!=0) {
			rem=num%10;
			sum+=((Math.pow(rem, count)));
			num=num/10;
			
		}
		if(sum==OriginalNumber) {
			System.out.println(OriginalNumber+"PalindroneNumber");
		}else {
			System.out.println(OriginalNumber+"Not A PalindroneNumber");
		}
		
	}

}
