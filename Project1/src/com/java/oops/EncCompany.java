package com.java.oops;


//Data hiding
/*
 * Data will be stored/accessed through variables
 * A public will have public access
 * anybody can access it , modify value of it
 * Data hiding concept is required to give readonly/restricted access to variables
 * If you make private variable , the other classes cannot reuse them
 *  
 *  To provide readonly access you make the variables as private variables
 *  And write methods to return the variable values
 *  These methods are called as getters 
 *  
 *  To Provide restricted access we write a method and write code to restrict the values
 *   if the employee age should be there between 18 to 65
 *   	then we have to prepare a setter method
 */
public class EncCompany {
	private int age=20;
	
	//getAge is a getter method which will return variable value
	public int getAge(){
		return age;
	}
	
	//setAge is a setter method which accept age between 18 to 65
	public void setAge(int empAge){
		if(empAge>65){
			System.out.println("Employee Age Must be less than or equal to 65");
		}
		else if(empAge<18){
			System.out.println("Employee Age Must be greater than or equal to 18");
		}
		else{
			age = empAge;
			System.out.println("employee age updated: "+age);
		}
	}
}








