package com.ArrayPrograms;

import java.util.Arrays;

public class Q_10 {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
