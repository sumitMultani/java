package com.corejavaB;

public class TestArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //{ 1, 3, 5, 7, 9, 8, 6, 4, 2 }
		// int[] b = new int[a.length];

		int count = 0;
		int countLength = a.length - 1;

		for (int j = 0; j < a.length; j++) {

			if (a[j] % 2 != 0) {
				int temp = a[j];
				a[count] = temp;
				count = count + 1;
			} else {
				int temp = a[j];
				//a[j] = a[count];
				a[countLength] = temp;
				countLength = countLength - 1;
			}
		}

		for (int item : a) {
			System.out.print(item + " ");
		}
	}

}
