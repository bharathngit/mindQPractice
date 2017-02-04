package com.java.basics;

public class C17SubStringsGet {

	public static void main(String[] args) {		
		
		String str1 = "mail sent to mindq@mindq.com successfully";
		//get sub string
		
		//this will work with only specific mail id
		System.out.println(str1.substring(13, 31));
		
		//this works with all mail id's 
		System.out.println(str1.substring(13, str1.length()-13));
	}

}
