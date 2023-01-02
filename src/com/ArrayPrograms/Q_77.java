package com.ArrayPrograms;

import java.util.Arrays;

public class Q_77 {
	// 77

	static void insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {

			int current = a[i];
			int j = i - 1;

			while (a[j] > current && j >= 0) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = current;
		}
		System.out.println(Arrays.toString(a));

	}

	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

	static void mergeSort(int[] arr, int left, int right) {

		if (left >= right) {
			return;
		}

		int mid = left + (right - left) / 2;

		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);

		int leftArrayStarting = left;
		int rightArrayStarting = mid + 1;

		int leftHalf[] = new int[mid - left + 1];// A
		int rightHalf[] = new int[right - mid];// B

		for (int i = 0; i < leftHalf.length; ++i) {
			leftHalf[i] = arr[leftArrayStarting + i];
		}
		for (int j = 0; j < rightHalf.length; ++j) {
			rightHalf[j] = arr[rightArrayStarting + j];
		}

		int index = left;
		int p1 = 0;
		int p2 = 0;
		while (p1 < leftHalf.length && p2 < rightHalf.length) {
			if (leftHalf[p1] <= rightHalf[p2]) {
				arr[index++] = leftHalf[p1];
				p1++;
			} else {
				arr[index++] = rightHalf[p2];
				p2++;
			}
		}
		while (p1 < leftHalf.length) {
			arr[index++] = leftHalf[p1];
			p1++;
		}
		while (p2 < rightHalf.length) {
			arr[index++] = rightHalf[p2];
			p2++;
		}
	}

	static void quickSort(int a[], int start, int end) {
		if (start < end) {
			int partitionIndex = partition(a, start, end);

			quickSort(a, start, partitionIndex - 1);
			quickSort(a, partitionIndex + 1, end);
		}
	}

	private static int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (a[j] <= pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i + 1];
		a[i + 1] = a[end];
		a[end] = temp;

		return i + 1;
	}

	static void bubbleSort(int arr[]) {
		while (true) {
			boolean sorted = true;
			for (int i = 0; i < arr.length - 1; i++)// i i + 1
			{
				if (arr[i] > arr[i + 1]) {
					sorted = false;
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

			if (sorted) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
