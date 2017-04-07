package com.test.DS;

/*
 * The array is searched sequentially and unsorted items are moved and
 * inserted into the sorted sub-list (in the same array). This algorithm is
 * not suitable for large data sets as its average and worst case complexity
 * are of Ο(n2), where n is the number of items.
 */
public class InsertionSortExample {

	public static void main(String[] args) {

		int count = 0;
		int[] elements = { 14, 33, 27, 10, 35, 19, 42, 44 };
		int length = elements.length - 1;
		int iteration = 0;

		while (count != length) {
			for (int i = 0; i < elements.length - 1; i++) {
				if (elements[i] < elements[i + 1]) {
					count++;
				} else {
					int demo = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = demo;

					for (int j = i; j > 0; j--) {
						int demo2 = elements[j];
						elements[j] = elements[j - 1];
						elements[j - 1] = demo2;
						iteration++;
					}
					iteration++;

				}

			}
			if (count == length)
				break;
			count = 0;

		}
		for (int val : elements) {
			System.out.print(val + " , ");
		}
		System.out.println("iteration : " + iteration);

	}

}
