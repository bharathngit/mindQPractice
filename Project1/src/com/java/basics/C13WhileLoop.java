package com.java.basics;

import java.util.Scanner;

public class C13WhileLoop {

	public static void main(String[] args) {
		
		int n=1;
		Scanner scn = new Scanner(System.in);
		
		while(n<10){
			System.out.println(n);
			System.out.println("enter value for n");
			n=scn.nextInt();
			
		}

	}

}
