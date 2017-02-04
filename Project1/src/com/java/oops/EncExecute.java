package com.java.oops;

public class EncExecute {

	public static void main(String[] args) {
		
		EncCompany enc1 = new EncCompany();	
		System.out.println(enc1.getAge());
		enc1.setAge(17);
		System.out.println(enc1.getAge());
		enc1.setAge(18);
		System.out.println(enc1.getAge());
		enc1.setAge(65);
		System.out.println(enc1.getAge());
		enc1.setAge(66);
		System.out.println(enc1.getAge());
		
		EncCompany enc2 = new EncCompany();
		System.out.println(enc2.getAge());
	}

}
