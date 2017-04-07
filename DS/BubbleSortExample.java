package com.test.DS;

/*Bubble sort is a simple sorting algorithm.
 *  This sorting algorithm is comparison-based algorithm in which each pair of adjacent
 *   elements is compared and the elements are swapped 
 *   if they are not in order. 
 *   This algorithm is not suitable for large data sets as 
 *   its average and worst case complexity are of Ο(n2) where n is the number of items.*/
public class BubbleSortExample {

	public static void main(String[] args) {

		int count = 0;
		int iteration = 0;
		int[] elements = { 14, 33, 27, 35, 10 };
		int length = elements.length - 1;
		while (count != length) {
			for (int i = 0; i < elements.length - 1; i++) {
				if (elements[i] < elements[i + 1]) {
					count++;
				} else {

					int demo = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = demo;
				}

			}
			if (count == length)
				break;
			count = 0;
			iteration++;
		}
		if (count == length) {
			for (int val : elements) {
				System.out.println(val);
			}
		}
		System.out.println("No. of Iteration : " + iteration);

	}
}
