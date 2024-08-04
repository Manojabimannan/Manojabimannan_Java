package com.techymeet.Java.Practices;

public class OccuranceFrequencyOfCharacters {

	public static void main(String[] args) {

		String Str="MaMojAbimannan";
		int [] frequency=new int[256];
		
		for(int i=0;i<Str.length();i++) {
			char ch=Str.charAt(i);
			frequency[ch]++;
		}
		for(int i=0;i<Str.length();i++) {
			char ch=Str.charAt(i);
			if(frequency[ch] !=0) {
				System.out.println("OccuranceFrequencyOfCharacters ="+ch+"frequency ="+frequency[ch]);
			}
			frequency[ch] = 0;
		}
	}

}
