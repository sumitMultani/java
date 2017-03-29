package com.java.codeSchool;

import java.util.Scanner;

public class RevNumberOfWay {
	public static void main(String[] args) {
		String newString = "";
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);//5781,---> 5871,5187,5718
											//8751,8571,8517,8157,
											//7851,
		System.out.println("Enter any number : ");// 423 --234 -- 432
		int num = sc.nextInt();
		String str = num + "";
		int size = str.length() + 1;
		int result = 0;
		int[] a = new int[str.length()];
		int i = 0;
		while (num > 0) {
			size = size - 1;
			int rem = num % 10;// 2
			num = num / 10;// 43

			int mul = (int) Math.pow(10, size - 1);
			result = result + rem * mul;

			for (; i < str.length();) {

				a[i] = rem;
				i = i + 1;
				break;
			}
		}
		System.out.println(result);
		for (int b : a) {
			System.out.println("b : " + b);
		}
		for (int k = 0; k < a.length; k++) {
			for(int n = k+1; n < a.length; n++) {
				if(a[k] < a[n]) {
					int ob = a[k];
					a[k] = a[n];
					a[n] = ob;
				}
			}
			System.out.println("sort : "+a[k]);
			newString = newString+a[k];
			
		}
		System.out.print("String val : " + newString);
		System.out.println();
		System.out.println("Int value : "+Integer.parseInt(newString));
	}

}
