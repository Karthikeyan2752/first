package com.ArrayPrograms;

import java.util.Arrays;

public class Q_70 {
	// 70

	static int secondLargestElement2(int[] a) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i : a) {
			if (a[i] > max) {
				max2 = max;
				max = a[i];
			}
		}
		return max2;
	}
	// 70

	static int secondLargestElement(int[] a) {
		Arrays.sort(a);
		return a[a.length - 2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
