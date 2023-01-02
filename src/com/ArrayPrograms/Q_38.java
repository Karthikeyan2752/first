package com.ArrayPrograms;

public class Q_38 {
	// 38

	static int largestElement(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i : a) {
			max = Math.max(a[i], max);
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
