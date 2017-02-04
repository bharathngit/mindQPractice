package com.java.access1;

public class C27AccModifiers1 {

	//this can be accessed from anywhere
	public String pb = "iam public";

	//this can be accessed from same package classes and through sub classes of this class
	//sub classes may be in this package or different package
	protected String pr = "iam protected";
	
	//this is default and can be accessed in side of same package classes
	String df = "iam default";
	
	//this can be accessed from only this class
	private String pv = "Iam private";

	public static void main(String[] args) {
		C27AccModifiers1 acc1 = new C27AccModifiers1();
		System.out.println(acc1.pb);
		System.out.println(acc1.pr);
		System.out.println(acc1.df);
		System.out.println(acc1.pv);

	}

}
