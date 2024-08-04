package com.techymeet.Java.Array;

public class SplitMethod {

	public static void main(String[] args) {

		String  Text= "Apple Orange WaterMelon";
		String [] Splits=Text.split(" ");
		for(String Word:Splits) {
			System.out.println(Word);
		}
		
	}

}
