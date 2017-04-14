package com.recursion.example;

public class FibonnicSeries {

	static int a = 0;

	static int b = 1;

	public static void main(String[] args) {

		getFibbonicSeries();
	}

	private static void getFibbonicSeries() {

		for (int i = 1; i <= 10; i++) {

			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
			c = a;

		}

	}

}
