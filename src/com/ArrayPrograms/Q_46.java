package com.ArrayPrograms;

public class Q_46 {
	// 46

	static int[] rightRotate(int[] a) {

		int temp = a[a.length - 1];

		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = temp;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
