package com.test.DS;

/*Selection sort is a simple sorting algorithm. 
 * This sorting algorithm is an in-place comparison-based algorithm in which the list is divided into two parts,
 *the sorted part at the left end and the unsorted part at the right end. 
 *Initially, the sorted part is empty and the unsorted part is the entire list.
 *
 *The smallest element is selected from the unsorted array and swapped with the leftmost element,
 *and that element becomes a part of the sorted array. This process continues moving unsorted array boundary by one element
 *to the right.
 *
 *This algorithm is not suitable for large data sets as its average and worst case complexities are of Ο(n2),
 *where n is the number of items.
 **/
public class SelectionSortExample {

	public static int[] doSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}

	public static void main(String a[]) {

		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		int[] arr2 = doSelectionSort(arr1);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

}
