package com.ArrayPrograms;

public class Q_9 {
	// 9

	static int[] mergeArrays(int[] arr1, int[] arr2) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
