package com.ArrayPrograms;

public class Q_39 {
	// 39

	static int smallestElement(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i : a) {
			min = Math.min(a[i], min);
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
