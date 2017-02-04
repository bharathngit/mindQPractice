package com.java.basics;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class C15StringsCompare {

	public static void main(String[] args) {

		// Comparing Strings
		String str1 = "selenium";
		String str2 = "selenium";

		// be low method is not suggested
		if (str1 == str2) {
			System.out.println("both are same");
		} else {
			System.out.println("both are different");
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("enter value for first string");
		str1 = scn.next();
		System.out.println("enter value for second string");
		str2 = scn.next();
		
		// suggested method
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are different");
		}

		str1 = JOptionPane.showInputDialog("enter value for string 1");
		str2 = JOptionPane.showInputDialog("enter value for string 2");
		if (str1.equalsIgnoreCase(str2)) {
			JOptionPane.showMessageDialog(null, "both are same");
		} else {
			JOptionPane.showMessageDialog(null, "both are different");
		}
		
		if(str1.compareToIgnoreCase(str2)==0){
			System.out.println("both are equal");
		}else{
			System.out.println("both are not equal");
		}
	}

}









