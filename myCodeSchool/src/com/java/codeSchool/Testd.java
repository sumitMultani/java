package com.corejavaB;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Testd {

	public static void main(String[] args) {

		// Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		Map<Integer, Map<String,Integer>> map = new HashMap<Integer,Map<String,Integer>>();
		
		Map<String,Integer> subjectMap = new TreeMap<String,Integer>();
		subjectMap.put("MATH1", 98);
		subjectMap.put("MATH2",94);
		subjectMap.put("MATH3", 87);
		Iterator<Entry<Integer, Map<String, Integer>>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			//System.out.println(entries.next());
		    Entry<Integer, Map<String, Integer>> entry = entries.next();
		  //  System.out.println(entry);
		    System.out.println("Roll No. = " + entry.getKey() + ", Marks = " + entry.getValue());
		}
	}

	private static void add(int i, int j) {

		System.out.println(i + j);
	}

	private static void print(String string) {

		System.out.println(string);
	}

	/** Function to check if given number is prime **/
	private static boolean isPrime(int n) {

		if (n == 2 || n == 3)
			return true;
		if (n == 1 || n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2)
			if (n % i == 0)
				return false;
		return true;
	}
}
