package com.corejavaB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	/* alphabet @ alphabet . alphabet */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email Id : ");
		String email = sc.next();

		Pattern p = Pattern.compile("[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+");
		Matcher m = p.matcher(email);
		
		if (m.find()) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid");
		}
	}

}
