package com.java.basics;

public class C9TwoDimensionalArrays {

	public static void main(String[] args) {

		int i [][] = new int[2][2];
		
		i[0][0]=100;
		i[0][1]=200;
		i[1][0]=300;
		i[1][1]=400;
		
		System.out.println(i[0][0]);
		//default value for integer is zero
		System.out.println(i[0][2]);
	
	}

}
