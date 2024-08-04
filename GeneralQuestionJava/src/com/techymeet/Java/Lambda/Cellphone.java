package com.techymeet.Java.Lambda;


public abstract class Cellphone implements Telephone  {

	
//	Telephone cc= ()-> {System.out.println("Frequency Was Changed");};
//	cc.rules();
		
		
//		Telephone cc=	(a,b)->{System.out.println(a+b);};
//		cc.add(100,200);
		public static void main(String [] args) {
		Telephone cc=	(a,b)->{return a+b;};
		System.out.println(cc.add(10,100));
		
		}
	
}
