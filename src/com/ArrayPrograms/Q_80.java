package com.ArrayPrograms;

public class Q_80 {
	// 80

	static boolean isSparseMatrix2(int[][] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 0) {
					count++;
				} else {
					count--;
				}
			}
		}
		return count > 0;
	}
	// 80

	static boolean isSparseMatrix(int[][] a) {
		int zeroCount = 0, numCount = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 0) {
					zeroCount++;
				} else {
					numCount++;
				}
			}
		}
		return zeroCount > numCount ? true : false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
