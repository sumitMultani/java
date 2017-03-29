package com.java.codeSchool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Factorial {

	int fact(int n) {

		int result;

		if (n == 1)
			return 1;

		result = fact(n - 1);

		return result;

	}
}

class GCD {

	public List<List<Integer>> find(List<Integer> lists) {

		List<List<Integer>> list = new LinkedList<List<Integer>>();

		if (lists != null && !lists.isEmpty()) {
			for (int val : lists) {

				List<Integer> b = new LinkedList<Integer>();
				for (int i = 1; i <= val; i++) {
					if (val % i == 0) {
						b.add(i);
					}
				}
				list.add(b);
				b = null;
			}
		}
		return list;

	}
}

public class Common {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first element : ");
		int first = sc.nextInt();
		System.out.println("Enter second element : ");
		int second =  sc.nextInt();
		List<Integer> al2 = new ArrayList<Integer>();
		List<Integer> al1 = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(first);
		list.add(second);
		GCD gcd = new GCD();
		List<List<Integer>> lst = gcd.find(list);

		for (int i = 0; i < lst.size(); i++) {
			if (i == 0) {
				al1 = (List<Integer>) lst.get(0);
			}
			if (i == 1) {
				al2 = (List<Integer>) lst.get(1);
			}

		}

		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for (int i = 0; i < al2.size(); i++) {
			for (int j = 0; j < al1.size(); j++) {
				if (al2.get(i).equals(al1.get(j)))
					// System.out.println("equals..:" + list1.get(j));
					list3.add(al1.get(j));
			}
		}

		// System.out.println("Equals : ");
		for (Integer val : list3) {
			// System.out.println(val);
		}

		System.out.println("GCD : " + list3.get(list3.size() - 1));

	}
}

/*
 * Factorial f = new Factorial(); int n = 5; System.out.println("Factorial of "
 * + n + " is " + f.fact(n));
 */

