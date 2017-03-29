package com.java.codeSchool;

import java.util.Scanner;

public class Tset {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value : ");
		String num = sc.next(); // 2361
		String[] val = new String[num.length()];
		String output = "";
		String last = "";

		for (int i = 0; i < num.length(); i++) {
			String str = num.charAt(i) + "";
			val[i] = str;
		}

		String[] original = val;
		//for (int j = 0; j < num.length(); j++) {

			//4532 -- 4532,4352,4235,4523
			for (int i = 0; i < num.length(); i++) {
				
				int count = 1;

				if (i == 0) {

				} else if (i > 0) {

					if (num.length() - 1 > i) {

						String temp = val[i];
						original[i] = val[i + count];
						original[i + count] = temp;

					}
				}

				for (String value : original) {
					output = output + value;
				}

				if (!(last.equals(output))) {

					for (String value : original) {
						System.out.print(value);

					} // 3456, 3564, 3546, 3654 , 3465,
				}

				last = output;
				output = "";
				System.out.println();
			}

		//}
	}
}
