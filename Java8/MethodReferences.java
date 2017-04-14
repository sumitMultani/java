package com.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences implements Comparable<MethodReferences> {

	private int id;

	public MethodReferences(int id) {

		this.id = id;
	}

	public MethodReferences() {

	}

	public static void main(String args[]) {

		MethodReferences m1 = new MethodReferences(22);
		MethodReferences m2 = new MethodReferences(21);

		System.out.println(m1.compareTo(m2));

		List<String> names = new ArrayList<String>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		names.forEach(System.out::println);
	}

	@Override
	public int compareTo(MethodReferences paramT) {

		return (this.id < paramT.id) ? -1 : (this.id > paramT.id) ? 1 : 0;
	}
}
