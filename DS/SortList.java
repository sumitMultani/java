package com.test.DS;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("v");
		list.add("m");
		list.add("a");
		list.add("h");
		list.add("b");
		list.add("w");

		Collections.sort(list);
		for (String str : list) {
			System.out.println(str);
		}
	}

}
