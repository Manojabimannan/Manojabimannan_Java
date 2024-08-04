package com.techymeet.Java.Practices;

import java.util.Arrays;

public class TwoPointerApproachReverse {

	public static void main(String[] args) {

		String name="Manoj";
		char[] c = name.toCharArray(); 
		int i = 0;
		int j = name.length()-1;
		//char temp=" ";
		while(i<=j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		String ans = Arrays.toString(c);
		System.out.println(ans);
	}

}
