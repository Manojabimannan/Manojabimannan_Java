package com.techymeet.Java.Practices;

import java.util.HashSet;

public class DuplicateValueFind {

	public static void main(String[] args) {

		//int [] arr= {2,4,6,8,10,2,5,8,4,7};
		int []arr= {2,4,5,1,3,4,5,4,9,6,2,8,3,1};
		
		HashSet<Integer>Dublicate=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&&!Dublicate.contains(arr[i])) {
					Dublicate.add(arr[i]);
					System.out.println(arr[i]);
					
				}
			}
		}
		
	}

}
