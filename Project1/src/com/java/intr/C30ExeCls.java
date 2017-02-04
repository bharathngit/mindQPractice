package com.java.intr;

public class C30ExeCls {

	public static void main(String[] args) {
		
		C28TataNano car1 = new C28TataNano();
		C29TataIndica car2 = new C29TataIndica();
		
		car1.backEngine();
		car1.makeBackCamera();

		car2.PassengerMode();
		
		//creating instance for the interface is not possible
		//to use the methods you have to create instance for the implementing class
		C27TataCars car = new C28TataNano();
		car.makeBackCamera();
		car.makeChildMode();
		car.makeGPS();
		
		C27TataCars car4 = new C29TataIndica();
		car4.makeBackCamera();
		car4.makeChildMode();
		car4.makeGPS();
		
	}

}






