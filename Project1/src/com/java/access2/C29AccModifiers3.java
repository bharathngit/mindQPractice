package com.java.access2;

//to access one package class in other package class you must import
import com.java.access1.C27AccModifiers1;

public class C29AccModifiers3 {

	public static void main(String[] args) {
		C27AccModifiers1 acc1 = new C27AccModifiers1();
		System.out.println(acc1.pb);

		//we cannot access private,default and protected variables of other package classes
		//System.out.println(acc1.pv);
		//System.out.println(acc1.pr);
		//System.out.println(acc1.df);
	}

}
