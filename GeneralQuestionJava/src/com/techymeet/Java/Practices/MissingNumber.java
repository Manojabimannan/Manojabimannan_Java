package com.techymeet.Java.Practices;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        int [] arr1=new int[10+1];
        for(int i:arr) {
        	arr1[i]++;
        }
        for(int i=1;i<=arr.length;i++) {
        	if(arr1[i] != 1) {
        		System.out.println(i);
        	}
        	
        }
        
       
    }
}
