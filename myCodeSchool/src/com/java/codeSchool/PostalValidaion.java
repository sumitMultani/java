package com.corejavaB;

import java.util.Scanner;

public class PostalValidaion {

	/* CA --- > 1 - A ,2 - N , 3-A , 4-N , 5-A, 6- N || 1 - A ,2 - N , 3-A */

	/* USA ---> 5-digit(12332) || 9-digit(45623-3443) */

	@SuppressWarnings({ "resource"  })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Postal code : ");
		String postal = sc.next();

		// (?i) case Insensitive
		String cap1 = "(?i)[a-z]{1,1}[0-9]{1,1}[a-z]{1,1}[0-9]{1,1}[a-z]{1,1}[0-9]{1,1}";
		String cap2 = "(?i)[a-z]{1,1}[0-9]{1,1}[a-z]{1,1}";
		String usap1 = "[0-9]{5}";
		String usap2 = "[0-9]{5}-[0-9]{4}";

		System.out.println("postal : " + postal);
		//Pattern p = Pattern.compile(cap1);
		//Matcher m = p.matcher(postal);

		// if (m.find() && postal.matches(cap)) {
		if (postal.matches(usap1) || postal.matches(usap2)
				|| postal.matches(cap1) || postal.matches(cap2)) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid");
		}

	}
}
