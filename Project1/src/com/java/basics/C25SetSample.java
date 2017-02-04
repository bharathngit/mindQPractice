package com.java.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C25SetSample {

	public static void main(String[] args) {
		// List can hold duplicate data
		//set can hold only unique data
		
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("val1");
		strSet.add("val2");
		strSet.add("val3");
		strSet.add("val1");
		strSet.add("val3");
		strSet.add("val4");
		for(String str:strSet){
			System.out.println(str);
		}
		
		Iterator it = strSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}








