package com.techymeet.Java.Practices;

public class Reverse {

	public static void main(String[] args) {

		String name ="LeveL";
		String Temp=" ";
		for(int i=name.length()-1;i>=0;i--) {
			Temp=Temp+name.charAt(i);
			
		}
		System.out.println(Temp);
		
	}

}
