package com.DS;

public class ReadAndStore {

	public static void main(String[] args) {

		String[][] array2d = new String[3][3]; // create 3 columns, 10 rows

		for (int row = 0; row < array2d.length; row++) {
			System.out.print("Enter a criminal name: ");
			array2d[row][0] = "kkask";

			System.out.print("Enter a crime: ");
			array2d[row][1] = "crime";

			System.out.print("Enter a year: ");
			array2d[row][2] = "2017";
		}

		for (String[] str1 : array2d) {
			System.out.println("2d :" + str1[0]);
			for (String str2 : str1) {
				System.out.println(str2);
			}
		}
	}

}
