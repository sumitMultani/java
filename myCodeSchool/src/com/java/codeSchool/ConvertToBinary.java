package com.java.codeSchool;

import java.util.Scanner;

public class ConvertToBinary {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int countO = 0, count1 = 0;
		String result = "";
		System.out.println("ENter Any Numeric Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while (num > 0) {
			int rem = num % 2;
			num = num / 2;
			result = result + rem;
		}
		// System.out.println(result);
		for (int i = 0; i < result.length(); i++) {
			String val = result.charAt(i) + "";

			if (val.equals("0"))
				countO++;
			else
				count1++;
		}

		StringBuilder sb = new StringBuilder(result);
		System.out.println(sb.reverse());
		System.out.println("No of 0 : " + countO + " , No. of 1 : " + count1);
	}
}
