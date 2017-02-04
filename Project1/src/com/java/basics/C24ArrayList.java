package com.java.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class C24ArrayList {

	public static void main(String[] args) {
		//arrays are fixed
		//array list is dynamic
		
		//arrays can hold premitive datatypes
		//arraylist accepts only reference
		
		//if you dont specify any datatype the default becomes Object datatype
		ArrayList<Integer> i = new ArrayList();
		i.add(10);
		i.add(20);
		
		for(int j:i){
			System.out.println(j);
		}
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add("selenium");
		
		for(Object obj:arr){
			System.out.println(obj);
		}
		
		for(int j=0;j<arr.size();j++){
			System.out.println(arr.get(j));
		}
		
		Iterator it = arr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}






