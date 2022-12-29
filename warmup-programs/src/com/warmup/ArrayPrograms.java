package com.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPrograms {

	// 9

	int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] mergedArray = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			} else if (arr1[i] > arr2[j]) {
				mergedArray[k] = arr2[j];
				j++;
			} else {
				mergedArray[k] = arr1[i];
				i++;
				j++;
			}
			k++;
		}
		/*
		 * if two sorted arrays are not in equal length this loop will add the remaining
		 * elements to the mergedArray
		 */
		while (i < arr1.length) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}
		return mergedArray;
	}

	// 10


	static int[] alternateSorting(int[] a) {

		Arrays.sort(a);
		int[] b = new int[a.length];
		int i = 0, j = a.length - 1, k = 0;
		while (i < j) {
			b[k++] = a[j--];
			b[k++] = a[i++];
		}
		if (a.length % 2 != 0) {
			b[k] = a[i];
		}
		return b;
	}

	// 11

	static int[][] rotateLeft2DArray(int[][] a) {
		// transpose of matrix
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		// swapping the rows
		for (int i = 0; i < a.length / 2; i++) {
			int l = 0, h = a.length - 1;
			while (l < h) {
				int temp = a[l][i];
				a[l][i] = a[h][i];
				a[h][i] = temp;
			}
		}
		return a;
	}

	static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 36

	static void printElementsInEven(int[] a) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

	// 37

	static void printElementsInOdd(int[] a) {
		for (int i = 1; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

	// 38

	static int largestElement(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i : a) {
			max = Math.max(a[i], max);
		}
		return max;
	}

	// 39

	static int smallestElement(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i : a) {
			min = Math.min(a[i], min);
		}
		return min;
	}

	// 40

	static int lengthOfArray(int[] a) {
		int count = 0;
		for (int i : a) {
			count++;
		}
		return count;
	}

	// 41

	static int[] copyElements(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}

	// 42

	static Map<Integer, Integer> frequencyOfElements(int[] a) {
		Map<Integer, Integer> map = new HashMap();

		for (int i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		return map;
	}

	// 43

	static int[] leftRotate(int[] a) {
		int temp = a[0]; // temp variable for storing the first element of the array
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = temp; // using the temp variable

		return a;
	}

	// 44

	static void printDuplicates(int[] a) {

		Map<Integer, Integer> frequencyMap = frequencyOfElements(a); // calculating the frequency using the helper
																		// method

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	// 45

	static void printSumOfElements(int[] a) {
		int sum = 0;

		for (int i : a) {
			sum += i;
		}
		System.out.println(sum);
	}

	// 46

	static int[] rightRotate(int[] a) {

		int temp = a[a.length - 1];

		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = temp;
		return a;
	}

	// 54

	static int[] alternateSorting2(int[] a) {
		// sorting the array
		Arrays.sort(a);
		
		for (int i = 0, j = a.length - 1; i < (a.length / 4); i += 2, j -= 2) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		return a;

	}

	public static void main(String[] args) {
		int[] a2 = { 13, 2, 4, 15, 12, 10, 5 };
		System.out.println(Arrays.toString(alternateSorting2(a2)));
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	}
}
