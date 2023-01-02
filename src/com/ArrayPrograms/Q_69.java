package com.ArrayPrograms;

import java.util.Arrays;

public class Q_69 {

	// 69

	static void rightRotate3(int a[], int d) {
		if (d == 0) {
			return;
		}

		int n = a.length;
		d %= n;
		reverseArray(a, 0, n - 1);
		reverseArray(a, 0, d - 1);
		reverseArray(a, d, n - 1);
		System.out.println(Arrays.toString(a));
	}

	private static void reverseArray(int a[], int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

	}

	// 69

	static void rightRotate2(int[] a, int d) {
		if (d > a.length) {
			d %= a.length;
		}
		int k = 0;
		int mid = a.length - d;
		int n = a.length;
		int[] b = new int[a.length];

		for (int i = mid; i < n; i++) {
			b[k++] = a[i];
		}
		for (int j = 0; j < mid; j++) {
			b[k++] = a[j];
		}
		System.out.println(Arrays.toString(b));

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
