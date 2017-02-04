package com.java.basics;

public class C16SubStringsFind {

	public static void main(String[] args) {		
		
		String str1 = "selenium";
		//find sub String exist
		//indexof gives position of sub string
		if(str1.indexOf("so")>=0){
			System.out.println("sub string exist");
		}else{
			System.out.println("sub string not exist");
		}
		//method 2
		//contains gives the sub string existance status
		if(str1.contains("S")){
			System.out.println("sub string exist");
		}else{
			System.out.println("sub string not exist");
		}
				
	}

}
