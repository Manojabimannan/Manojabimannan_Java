package com.techymeet.Java.Practices;

public class WithoutSortFindSecondlargestNumber {

	public static void main(String[] args) {

		int[] numbers = {4, 2, 9, 5, 7, 6};
		
		System.out.println(findsecond(numbers));
	}

	private static int findsecond(int[] numbers) {
		// TODO Auto-generated method stub
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int Third=Integer.MIN_VALUE;
		for(int i:numbers) {
			first = Math.max(first, i);
		}
		for(int i:numbers) {
			if(i!=first) {
				second = Math.max(second, i);
			}
		}
		for(int i:numbers) {
			if(i!=second && i!=first) {
				Third=Math.max(Third, i);
			}
		}
		return Third;
	}

}
