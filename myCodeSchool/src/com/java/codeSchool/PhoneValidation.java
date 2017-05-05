package com.corejavaB;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidation {

	/* 10-digit numeric --> (667) 123-7887 */
 
	public static void main(String[] args) {
 
		System.out.println("Enter Phone Number : ");
		//String phone = sc.next();
		String phone ="(((221) 333-3222";
		System.out.println(phone);
		
		String pattern = "(?i)[(]{1}[0-9]{3}\\){1,1}\\s[0-9]{3}-[0-9]{4}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(phone);
		if (m.find()) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid");
		}

	}
}
