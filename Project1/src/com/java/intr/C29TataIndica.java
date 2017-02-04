package com.java.intr;

public class C29TataIndica implements C27TataCars {

	public void PassengerMode(){
		System.out.println("passenger mode implemented in indica");
	}

	@Override
	public void makeChildMode() {
		System.out.println("child mode implemented in indica");
		
	}

	@Override
	public void makeBackCamera() {
		System.out.println("back camera implemented in indica");
		
	}


	@Override
	public void makeGPS() {
		System.out.println("gps implemented in indica");
		
	}
}
