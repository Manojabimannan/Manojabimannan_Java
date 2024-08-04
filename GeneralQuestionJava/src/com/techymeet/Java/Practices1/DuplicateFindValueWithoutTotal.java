package com.techymeet.Java.Practices1;

import java.util.HashSet;

public class DuplicateFindValueWithoutTotal {

	public static void main(String[] args) {

		int []arr= {2,4,5,1,3,4,5,4,9,6,2,8,3,1};
		HashSet<Integer>Duplicate=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&&!Duplicate.contains(arr[i])) {
					Duplicate.add(arr[i]);
					System.out.println(arr[i]);
				}
			}
		}
	}

}
