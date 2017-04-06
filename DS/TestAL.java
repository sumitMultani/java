package com.test.DS;

import java.util.Arrays;
import java.util.List;

public class TestAL {

	private static Object[] EMPTY_ARRAY_LIST = {};

	private static int count = 0;

	private static Object[] DEFAULT_ARRAY_LIST = new Object[10];

	private static Object[] ARRAY_LIST_SIZE = {};

	@SuppressWarnings("static-access")
	public boolean add(String element) {

		int size = EMPTY_ARRAY_LIST.length;
		boolean flag = false;
		if (this.EMPTY_ARRAY_LIST.length <= size && count <= size - 1) {

			this.EMPTY_ARRAY_LIST[count] = element;
			count++;

		} else {

			if (count == 10 && EMPTY_ARRAY_LIST.length <= count) {
				// size = (size * 3)/2 + 1;
				size = size + (size >> 1);
				ARRAY_LIST_SIZE = new Object[20];
				Arrays.toString(EMPTY_ARRAY_LIST);
				System.arraycopy(EMPTY_ARRAY_LIST, 0, ARRAY_LIST_SIZE, 0,
						EMPTY_ARRAY_LIST.length);
				Arrays.toString(ARRAY_LIST_SIZE);
			}
			this.ARRAY_LIST_SIZE[count] = element;
			count++;
		}

		return flag;
	}

	public Object get(int index) {

		Object obj = null;
		if (EMPTY_ARRAY_LIST.length < 10) {
			obj = EMPTY_ARRAY_LIST[index];
		} else {
			obj = ARRAY_LIST_SIZE[index];
		}
		return obj;

	}

	public TestAL() {

		super();
		EMPTY_ARRAY_LIST = DEFAULT_ARRAY_LIST;

	}

	public TestAL(int initialCapacity) {

		super();
		if (initialCapacity < 0)

			throw new IllegalArgumentException("Illegal Capacity: "
					+ initialCapacity);

		EMPTY_ARRAY_LIST = new Object[initialCapacity];

	}

	public void clear() {

		EMPTY_ARRAY_LIST = new Object[10];

	}

	public static void main(String[] args) {

		TestAL al = new TestAL(100);
		al.add("a1");
		al.add("a2");
		al.add("a3");
		al.add("a4");
		al.add("a5");
		al.add("a6");
		al.add("a7");
		al.add("b8");
		al.add("b9");
		al.add("b10");
		al.add("b11");

		System.out.println(al.get(0));
		System.out.println(al.get(7));
		System.out.println(al.get(9));
		System.out.println(al.get(10));

		// convert array to List
		//List a = Arrays.asList(EMPTY_ARRAY_LIST);

		// al.clear();
		System.out.println("length : " + EMPTY_ARRAY_LIST.length
				+ "   ,val at 0 index : " + al.get(0));
	}

}
