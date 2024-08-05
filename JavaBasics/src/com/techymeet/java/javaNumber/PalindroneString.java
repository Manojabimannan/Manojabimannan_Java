package com.techymeet.java.javaNumber;

public class PalindroneString {

	public static void main(String[] args) {

		String Name="ManojAbimannan";
		String ReName=" ";
		for(int i=Name.length()-1;i>=0;i--) {
			ReName=ReName+Name.charAt(i);
		}
		System.out.println(ReName);
	}

}
