package com.java.intr;

public class C28TataNano implements C27TataCars {

	public void backEngine(){
		System.out.println("back engine imlemented in nano");
	}


	@Override
	public void makeChildMode() {
		System.out.println("child mode implemented in nano");
		
	}

	@Override
	public void makeBackCamera() {
		System.out.println("back camera implemented in nano");
		
	}


	@Override
	public void makeGPS() {
		System.out.println("gps implemented in nano");
		
	}
}
