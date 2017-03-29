package com.java.codeSchool;

public class SwapInBubbleSort {
	public static void main(String[] args) {
		int count = 0;
		int[] a = new int[5];
		a[0] = 2;
		a[1] = 1;
		a[2] = 4;
		a[3] = 6;
		a[4] = 3;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int num = a[i];
					a[i] = a[j];
					a[j] = num;
					count = count + 1;
				}
			}
			System.out.println(a[i]);
		}

//		for (int k = 0; k < a.length; k++) {
//			System.out.println(a[k]);
//		}
			System.out.println("count : "+count);
	}

}
