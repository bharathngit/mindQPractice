package com.java.oops;

public class InhExecute {

	public static void main(String[] args) {
		
		InhCalc2 calc = new InhCalc2();
		//below method is not there in InhCalc2 still we are able access it
		System.out.println(calc.demoAdd(10, 20));
		System.out.println(calc.demoAdd(10, 20,30));
		System.out.println(calc.demoDev(100, 20));
		System.out.println(calc.demoAdd("10","20"));
	}

}
