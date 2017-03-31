package com.java.codeSchool;

public class Palindrome {

	public static void main(String[] args) {

		String str = "j";
		boolean flag = false;
		// //-------------------------1st -----most efficient way to find
		// palindrome.

		// StringBuilder sb = new StringBuilder(str);
		// sb.reverse();
		// System.out.println(str.equals(sb.toString()));

		// -------------------------2nd -----------
		// for (int i = 0; i <= str.length() / 2; i++) {
		// for (int j = str.length() - 1; j >= str.length() / 2; j--) {
		// if (str.charAt(i) != str.charAt(j)) {
		// flag = false;
		// break;
		// } else
		// flag = true;
		// i++;
		// }
		// if (!flag) {
		// break;
		// }
		// }
		// / if (flag)
		// System.out.println("YES");
		// else
		// System.out.println("NO");
		
		// -------------------------3rd -----
		int length = str.length() - 1;
		if (length == 0) {
			flag = true;
		} else {
			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(length)) {
					flag = false;
					break;
				} else
					flag = true;
				length--;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
