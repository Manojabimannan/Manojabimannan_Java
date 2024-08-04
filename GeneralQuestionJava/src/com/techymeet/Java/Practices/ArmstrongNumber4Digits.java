package com.techymeet.Java.Practices;

import java.util.Scanner;

public class ArmstrongNumber4Digits {

	public static void main(String[] args) {

		int digits1,digits2,digits3,digits4, result,temp;
		
		Scanner in =new Scanner(System.in);
		
//		for(int number=1000;number<=9999;number++) {
		int number=in.nextInt();
			temp=number;
			
			digits4=temp%10;
			temp=temp/10;
			
			digits3=temp%10;
			temp=temp/10;
			
			digits2=temp%10;
			temp=temp/10;
			
			digits1=temp%10;
			
			result=(int) ((int)Math.pow(digits1, 4)+Math.pow(digits2, 4)+Math.pow(digits3, 4)+Math.pow(digits4, 4));
	
			if(result==number) {
				System.out.println(number+"ArmStrong");
			}else {
				

			}
			
			
			
		}
	}


