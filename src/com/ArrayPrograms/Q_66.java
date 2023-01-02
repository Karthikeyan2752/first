package com.ArrayPrograms;

import java.util.Arrays;

public class Q_66 {
	// 66

	static void leftRotate2(int a[], int d) { // d is number of rotations
		int n = a.length;
		d %= n;
		int i, j, k, temp;

		int gcd = gCD(d, n);

		for (i = 0; i < gcd; i++) {
			temp = a[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n) {
					k = k - n;
				}
				if (k == i) {
					break;
				}
				a[j] = a[k];
				j = k;
			}
			a[j] = temp;
		}

		System.out.println(Arrays.toString(a));

	}

	private static int gCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gCD(b, a % b);
	}

	// 66

	static void leftRotate3(int a[], int d) {
		if (d == 0) {
			return;
		}

		int n = a.length;
		d %= n;
		reverseArray(a, 0, d - 1);
		reverseArray(a, d, n - 1);
		reverseArray(a, 0, n - 1);

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
