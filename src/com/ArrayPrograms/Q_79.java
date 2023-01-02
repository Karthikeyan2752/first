package com.ArrayPrograms;

public class Q_79 {
	// 79

	static boolean isIdentityMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if ((i == j && a[i][j] != 1) || (a[i][j] != 0 && i != j)) {
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
