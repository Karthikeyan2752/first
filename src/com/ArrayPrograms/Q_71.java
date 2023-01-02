package com.ArrayPrograms;

import java.util.Arrays;

public class Q_71 {
	// 71

	static int secondSmallestElement2(int[] a) {
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i : a) {
			if (a[i] < min) {
				min2 = min;
				min = a[i];
			}
		}
		return min2;
	}
	// 71

	static int secondSmallestElement(int[] a) {
		Arrays.sort(a);
		return a[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
