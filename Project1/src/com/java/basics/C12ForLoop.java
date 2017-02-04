package com.java.basics;

public class C12ForLoop {

	public static void main(String[] args) {

		// print number 5 for 10 times
		System.out.println("print number 5 for 10 times");
		for (int i = 11; i <= 20; i++) {
			System.out.println(5);
		}

		// print numbers from 1 to 10
		System.out.println("print numbers from 1 to 10");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// print odd numbers from 1 to 10
		System.out.println("print odd numbers from 1 to 10");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}

		// print values from array
		System.out.println("print values from array");
		Object obj[] = { 10, "selenium", 30, "wd" };

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		// print values from 10 to 1
		System.out.println("print values from 10 to 1");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
