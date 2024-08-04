package com.techymeet.Java.Practices;

public class OccuranceFrequencyInteger {

	public static void main(String[] args) {

		int numbers[]= {1,2,3,4,1,2,1,2,3,4,5,6,3,8};
		int [] OccuranceFrequencyInteger=new int [10];
		for(int number:numbers) {
			OccuranceFrequencyInteger[number]++;
		}
		for(int i=0;i<OccuranceFrequencyInteger.length;i++) {
			if(OccuranceFrequencyInteger[i]>0) {
				System.out.println("OccuranceFrequencyInteger ="+i+"OccuranceFrequencyIntegerCount ="+OccuranceFrequencyInteger[i]);
			}
		}
	}

}
