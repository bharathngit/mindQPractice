package com.java.basics;

public class C19ClassObject {
	static String str="hello";
	String str1="hi";
	
	//a static method can access static members with/without instance
	//non-static/instance members should be accessed using instance
	
	//an instance method can access any class member with or without instance
	
	//static variables maintain a single values across all instances
	//if you change the value in any instance, that will get updated in all instances
	//These are called class level variables
	
	//instance variables will have different values for each instance
	
	
	//When accessing static members from other classes you can use instance or classname
	
	public static void main(String[] args) {
		
		System.out.println(str);
		demoAdd();
		//create instance for the class
		C19ClassObject co1 = new C19ClassObject();
		co1.demoAdd2();
		System.out.println(co1.str1);
		System.out.println(co1.str);
		
		co1.str1="new change1";
		co1.str="new change in static1";
		
		//create another instance
		C19ClassObject co2 = new C19ClassObject();
		co2.str1="new change2";
		co2.str="new change in static2";
		
		System.out.println("direct access str:"+str);
		System.out.println("str value at co1"+co1.str);
		System.out.println("str value at co2"+co2.str);
		System.out.println("str1 value at co1"+co1.str1);
		System.out.println("str1 value at co2"+co2.str1);
		
	}

	public static void demoAdd(){
		System.out.println(2+3);
	}
	public void demoAdd2(){
		System.out.println(10+20);
		System.out.println(str);
		System.out.println(str1);
		demoAdd();
	}
}





