package com.java.oops;

//inheriting the features from one class to another
public class InhCalc2 extends InhCalc1{

	//InhCalc2 will have all the features of InhCalc1
	
	public double demoDev(int a,int b){
		System.out.println("executing from child");
		return a/b;
	}
	public String demoAdd(String a, String b){
		System.out.println("executing from child");
		return a+b;
	}
	//writing same method name with same number of parameters as it how in parent
	//this concept is called overriding
	public int demoAdd(int a, int b,int c){
		System.out.println("executing from child");
		return a+b+c;
	}
}
