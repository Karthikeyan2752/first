package com.ArrayPrograms;

import java.util.Arrays;

public class Q_63 {
	// 63

	static void minAndMax(int[] a) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("maximum element: " + max + "\nminimum element: " + min);
	}
	// 63

	static void minAndMax2(int[] a) {
		if (a.length == 0) {
			return;
		}
		Arrays.sort(a);
		System.out.println("maximum element: " + a[a.length - 1] + "\nminimum element: " + a[0]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
