package com.java.basics;

public class C21MethodSamples {

	public static void main(String[] args) {
		//a method is a reusable code block
		
		//void means the method will not return any value
		
		C21MethodSamples ms = new C21MethodSamples(2);
		ms.demoadd();
		int x = ms.demoadd1();
		System.out.println(x);
		System.out.println(ms.demoadd1());
		
		ms.demoAdd2(100, 200);
		System.out.println(ms.demoAdd3(45, 55));
		
		String st[] = ms.demoReturn();
		System.out.println(st[0]);
	}
	//method with no return value
	public void demoadd(){
		System.out.println(2+3);
	}
	//method with return value
	public int demoadd1(){
		return 2+3;
	}
	
	//method with parameters
	public void demoAdd2(int a, int b){
		System.out.println(a+b);
	}
	
	//method with parameters and retun value
	public int demoAdd3(int a, int b){
		return a+b;
	}
	
	//method with multiple return values
	public String[] demoReturn(){
		String str[]={"sel1","web"};
		
		return str;
	}
	
	//constructor method which will be executed along with the class instance
	//the constructor will have same class name
	//if the constructor is having parameters then we must provide the values while creating instance
	//we can have multiple costructors with different method parameters
	
	C21MethodSamples(int a){
		System.out.println("this is a constructor");
		System.out.println(a);
	}
}










