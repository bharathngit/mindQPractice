package com.java.access1;

public class C28AccModifiers2 {

	public static void main(String[] args) {
		C27AccModifiers1 acc1 = new C27AccModifiers1();
		System.out.println(acc1.pb);
		System.out.println(acc1.pr);
		System.out.println(acc1.df);
		//we cannot access private variables of other class
		//System.out.println(acc1.pv);

	}

}
