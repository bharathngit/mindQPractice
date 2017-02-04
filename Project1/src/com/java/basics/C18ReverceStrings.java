package com.java.basics;

public class C18ReverceStrings {

	public static void main(String[] args) {
		String str1 = "selenium";
		
		char ch[] = str1.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
		System.out.println();
		
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
		//reverse string using sub string technique
		
		String str2 = "webdriver";
		
		for(int i=str2.length();i>0;i--){
			System.out.print(str2.substring(i-1, i));
		}
		
//		StringBuffer sb = new StringBuffer("selenium");
//		System.out.println(sb.reverse());
		
	}

}






