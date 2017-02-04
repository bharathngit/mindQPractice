package com.java.access2;

//to access one package class in other package class you must import
import com.java.access1.C27AccModifiers1;

//This class is a sub class for C27AccModifiers1 class
//so we can access protected class members through this class instance

public class C30AccModifiers4 extends C27AccModifiers1{

	public static void main(String[] args) {
		C27AccModifiers1 acc1 = new C27AccModifiers1();
		System.out.println(acc1.pb);

		//we cannot access private,default and protected variables of other package classes
		//System.out.println(acc1.pv);
		//System.out.println(acc1.pr);
		//System.out.println(acc1.df);
		
		C30AccModifiers4 acc2 = new C30AccModifiers4();
		System.out.println(acc2.pb);
		System.out.println(acc2.pr);
	}

}





