package com.java.oops;

public class InhCalc1 {

	public int demoAdd(int a, int b){
		System.out.println("executing from Parent");
		return a+b;
	}
	
	//creating a method with same existing method name and different parameters
	//this concept is called over loading
	public int demoAdd(int a, int b,int c){
		System.out.println("executing from Parent");
		return a+b+c;
	}
	
	public int demoMul(int a, int b){
		System.out.println("executing from Parent");
		return a*b;
	}
}
