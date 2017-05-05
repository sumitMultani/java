package com.corejavaB;

import java.util.Scanner;

public class FindNextPrime {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entr any Number here : ");
		int num = sc.nextInt();

		for (int i = 2; i <= num - 1; i++) {

			if (num % i == 0) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}

		if (!flag) {
			System.out.println("prime num : " + num);
		} else {
			System.out.println(num + " Not Prime");
		}
		
		int next = num + 1;
		for (int j = next; true; j++) {
			for (int k = 2; k <= j - 1; k++) {

				if (j % k == 0) {
					flag = true;
					break;
				} else {
					flag = false;
					next = j;

				}
			}
			if (!flag) {
				System.out
						.println("After " + num + " next prime num : " + next);
				break;

			}
		}
		
		boolean val  = oddOrNot(num);
		System.out.println("num is Even : "+val);

		/*
		 * String[] ignoreProps = { "customBrokerTypeId" }; for (String str :
		 * ignoreProps) { System.out.println(str); }
		 */
		 System.out.print("H" + "a");
		 System.out.print('H' + 'a');

	}
	public static  boolean oddOrNot(int num) {
		 
	    return (num & 1) != 0;
	 
	}

}
