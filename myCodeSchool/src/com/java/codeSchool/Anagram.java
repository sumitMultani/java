package com.java.codeSchool;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Anagram {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		System.out.println();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Value : ");
		String str1 = sc.next();
		System.out.println("Enter 2nd Value : ");
		String str2 = sc.next();

		Map<String, Integer> map1 = new TreeMap<String, Integer>();
		Map<String, Integer> map2 = new TreeMap<String, Integer>();
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				int k = 1;
				String str = str1.charAt(i) + "";

				if (map1.isEmpty() || map1.get(str) == null) {
					map1.put(str, k);
				} else {
					int val = (int) map1.get(str);
					map1.put(str, val + 1);
				}

			}

			for (int i = 0; i < str2.length(); i++) {
				int k = 1;
				String str = str2.charAt(i) + "";

				if (map2.isEmpty() || map2.get(str) == null) {
					map2.put(str, k);
				} else {
					int val = (int) map2.get(str);
					map2.put(str, val + 1);
				}

			}
		}// if
		boolean sts = false;
		Set<?> s1 = map1.entrySet();
		Iterator<?> itr1 = s1.iterator();

		Set<?> s2 = map2.entrySet();
		Iterator<?> itr2 = s2.iterator();

		while (itr1.hasNext() && itr2.hasNext()) {
			Map.Entry mapentry1 = (Map.Entry) itr1.next();
			Map.Entry mapentry2 = (Map.Entry) itr2.next();
			if (mapentry1.getKey().equals(mapentry2.getKey())
					&& mapentry1.getValue() == mapentry2.getValue()) {
				sts = true;
			} else {
				sts = false;
				break;
			}
		}

		if (sts) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
