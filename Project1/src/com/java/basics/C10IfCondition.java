package com.java.basics;

import java.util.Scanner;

public class C10IfCondition {

	public static void main(String[] args) {

		// scanner is used take inputs through console
		Scanner scn = new Scanner(System.in);
		System.out.println("enter value for x");
		// nextInt will ask for integer value
		// next will ask for string value
		int x = scn.nextInt();
		System.out.println("enter value for y");
		int y = scn.nextInt();

		if (x > y) {
			System.out.println("x is bigger");
		} else if (x < y) {
			System.out.println("y is bigger");
		} else {
			System.out.println("both are equal");
		}
	}

}
