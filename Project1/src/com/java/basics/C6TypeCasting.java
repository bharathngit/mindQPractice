package com.java.basics;

public class C6TypeCasting {

	public static void main(String[] args) {

		/*
		 * implicit cast : storing lower range datatype variable in upper range
		 * datatype variable
		 * 
		 * Explicit cast : storing higher range datatype variable in lower range
		 * datatype variable
		 * For explicit casting you need use (datatype) is assign value
		 */
		byte b = 100;
		int i = b;
		
		System.out.println(i);
		i=127;
		b = (byte) i;
		System.out.println(b);
	}

}
