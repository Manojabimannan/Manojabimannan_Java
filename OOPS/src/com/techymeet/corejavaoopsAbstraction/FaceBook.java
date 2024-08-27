 package com.techymeet.corejavaoopsAbstraction;

public class FaceBook implements WhatApp {

	@Override
	public void SocialMedia() {
		System.out.println("SocialMedia..");

	}

	@Override
	public void WhatApp() {
		System.out.println("WhatApp..");
		
	}
	

	public static void main(String[] args) {
		FaceBook FB=new FaceBook();
		FB.SocialMedia();
		FB.WhatApp();

		WhatApp WA=new FaceBook();
		WA.SocialMedia();
		WA.WhatApp();
		
		
		
	}



	

}
