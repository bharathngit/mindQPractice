package com.java.basics;

import java.util.HashMap;

public class C26HashMapSample {

	public static void main(String[] args) {
		HashMap userDetails= new HashMap();
		userDetails.put("password", "qwerty");
		userDetails.put("username", "sudhakar");
		System.out.println(userDetails.get("username"));
		
		//storing arrays in hashmap
		String[] str = {"s","w"};
		userDetails.put("username", str);

		//print array data 
		System.out.println(((String[])userDetails.get("username"))[1]);

		String[] strArr = (String[])userDetails.get("username");
		System.out.println(strArr[0]);
		
	}

}






