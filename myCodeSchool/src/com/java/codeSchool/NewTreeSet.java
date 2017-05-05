package com.corejavaB;

public class NewTreeSet {

	// static boolean b;
	public static void main(String[] args) {

		/*
		 * int i = 0, j = 5; tp: for (;;) { i++; for (;;) { if(i > --j) { break
		 * tp; } } System.out.println("i =" + i + ", j = " + j);
		 */
		/*
		 * int i = 0; while(1) { if(i == 4) { break; } ++i; }
		 * System.out.println("i = " + i);
		 */
		int I = 1;
		String monthString = "";
		switch (I) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		}
		System.out.println(monthString);
		if (I < 2) {
			System.out.print("I is " + I);
			I++;
			// continue I;
		}

	}
}