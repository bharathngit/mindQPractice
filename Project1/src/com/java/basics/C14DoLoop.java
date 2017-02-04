package com.java.basics;

import java.util.Scanner;

public class C14DoLoop {

	public static void main(String[] args) {

		int n = 10;
		Scanner scn = new Scanner(System.in);

		do {
			System.out.println(n);
			System.out.println("enter value for n");
			n = scn.nextInt();

		} while (n < 10);

	}

}
