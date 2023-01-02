package com.ArrayPrograms;

public class Q_81 {
	// 81

	static boolean isEqualMatrix2(int[][] a, int[][] b) {

		if (a.length != b.length && a[0].length != b[0].length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (Integer.valueOf(a[i][j]).compareTo(Integer.valueOf(b[i][j])) != 0) {
					return false;
				}
			}
		}
		return true;
	}
	// 81

	static boolean isEqualMatrix(int[][] a, int[][] b) {

		if (a.length != b.length && a[0].length != b[0].length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
