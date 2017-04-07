package com.test.DS;

/*Quicksort is a fast, recursive, non-stable sort algorithm which works by the divide and conquer principle. 
 * 
 * Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays.
 *A large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot, 
 *based on which the partition is made and another array holds values greater than the pivot value.

 *Quick sort partitions an array and then calls itself recursively twice to sort the two resulting subarrays.
 *This algorithm is quite efficient for large-sized data sets as its average and worst case complexity are of Ο(n2),
 *where n is the number of items.
 */

public class QuickSortExample {

	private int array[];

	private int length;

	public void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]) {

		QuickSortExample sorter = new QuickSortExample();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
