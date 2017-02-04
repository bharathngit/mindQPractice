package com.java.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C23RegularExpressionsMatches {

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
		String content = "Hello how are you..hello ";
		
		//regular expression 
		String patternString = "h.";

		
		//specify case sensitive condition 
		Pattern pattern = Pattern.compile(patternString);
		//execute search
		Matcher matcher = pattern.matcher(content);

		//matcher.matches will verify pattern and matches strings are equal
		
		if(matcher.matches()){
			System.out.println("both are equal");
		}else{
			System.out.println("both are different");
		}
		
		while(matcher.find()){
			System.out.println(matcher.group(0));
		}
	}

}





