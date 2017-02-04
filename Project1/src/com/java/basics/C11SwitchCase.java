package com.java.basics;

import java.util.Scanner;

public class C11SwitchCase {

	public static void main(String[] args) {

		// scanner is used take inputs through console
		Scanner scn = new Scanner(System.in);

		System.out.println("enter state code");
		String stCode = scn.next();
		
		switch(stCode.toLowerCase()){
		case "ap":
			System.out.println("amaravathi");
			
		case "ts":
			System.out.println("hyderabad");
			break;
		case "tn":
			System.out.println("chennai");
			
			break;			
		default:
			System.out.println("statecode not matched");
			break;
		}
		
	
	
	}

}







