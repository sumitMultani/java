package com.corejavaB;

public class ArrayEx {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int start = 0;
		int end = a.length-1;
		int range = a.length-1;
		for (int i = 0; i <= range / 2; i++) {

			System.out.println(a[start]);
			System.out.println(a[end]);
			start++;end--;

		}
	}

}
