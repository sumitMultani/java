package com.java.codeSchool;

class ByteShift {

	public static void main(String args[]) {

		byte a = 64, b;
		int i;
		i = a >> 2;
		b = (byte) (a >> 2);
		System.out.println("Original value of a: " + a);
		System.out.println("i and b: " + i + " " + b);

		int j;
		int num = 0xFFFFFFE;
		for (j = 0; j < 4; j++) {
			num = num << 1;
			System.out.println(num);
		}
	}
}