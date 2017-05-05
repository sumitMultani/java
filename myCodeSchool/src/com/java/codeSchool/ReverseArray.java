package com.corejavaB;

public class ReverseArray {

	public static void main(String[] args) {

		int[] a = { 12, 32, 32, 4, 2, 34, 23, 4, 29, 24, 23 };
		int[] b = new int[a.length];
		int index = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			b[index] = a[i];
			index++;
		}
		for (int val : b) {
			System.out.println(val);
		}

	}

}
