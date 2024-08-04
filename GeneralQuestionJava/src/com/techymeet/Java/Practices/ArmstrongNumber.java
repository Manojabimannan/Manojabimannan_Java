package com.techymeet.Java.Practices;

import java.util.*;
public class ArmstrongNumber {
	
    public static void main(String[] args) {
   
    	Scanner n=new Scanner(System.in);
    	int result, digits1,digits2,digits3,temp;
    	
    	int number=n.nextInt();
    	
    		temp=number;
    		digits3=temp%10;
    		temp=temp/10;
    		
    		digits2=temp%10;
    		temp=temp/10;

    		
    		digits1=temp%10;
    		result=(int) (Math.pow(digits1, 3)+Math.pow(digits2, 3)+Math.pow(digits3, 3));
    		if(result==number) {
    			System.out.println(number+"ArmstrongNumber");
    		}
    		else {
    			System.out.println(number+"Not a ArmstrongNumber");
    		}

    		
    	}
    	
    	
    	
    }
    


