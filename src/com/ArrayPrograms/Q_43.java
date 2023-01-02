package com.ArrayPrograms;

public class Q_43 {
	// 43

	static int[] leftRotate(int[] a) {
		int temp = a[0]; // temp variable for storing the first element of the array
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = temp; // using the temp variable

		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
