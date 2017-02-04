package com.java.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C22RegularExpressionsMatcher {

	public static void main(String[] args) {
		// ABCDE1234Z
		//ABCDE234ZX

		/*00:00:00
		 * 12:00:00
		 * 24:00:00
		 * 23:50:59
		 * 
		 */
		//where to search
		String content = "This is webdriv.er class";
		
		//regular expression 
		String patternString = "driv\\.eR";

		//specify case sensitive condition 
		Pattern pattern = Pattern.compile(patternString,
				Pattern.CASE_INSENSITIVE);
		//execute search
		Matcher matcher = pattern.matcher(content);
		
//		//if it matches it gives true
//		boolean isMatched = matcher.matches();
//		System.out.println("Is it a Match?" + isMatched);
		
		if(matcher.find()){
			System.out.println(matcher.group(0));
		}

	}

}





