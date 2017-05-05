package com.corejavaB;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number  : ");
		Long number = sc.nextLong();

		int a = 0;
		int add = 1;

		for (int i = 0; i <= number; i++) {
			System.out.println(a);
			a = a + add;
			add++;
		}
	}
}
