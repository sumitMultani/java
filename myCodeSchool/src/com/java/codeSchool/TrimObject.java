package com.test;

public class TrimObject {

	public static void main(String[] args) {

		String str = "  i am sofware developer   ";
		String newStr = "";

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != ' ') {
				newStr = str.substring(i, str.length() - 1);
				break;
			}
		}
		System.out.println("new STring :" + newStr);
		for (int j = newStr.length() - 1; j > 0; j--) {
			if (newStr.charAt(j) != ' ') {
				newStr = newStr.substring(0, j+1);
				break;
			}
		}
		System.out.println("new STring :" + newStr.length());
		System.out.println("new STring :" + newStr+"assas");
	}

}
