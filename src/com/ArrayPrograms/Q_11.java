package com.ArrayPrograms;

public class Q_11 {
	// 11

	static int[][] rotateLeft2DArray(int[][] a) {
		// transpose of matrix
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		// swapping the rows
		for (int i = 0; i < a.length / 2; i++) {
			int l = 0, h = a.length - 1;
			while (l < h) {
				int temp = a[l][i];
				a[l][i] = a[h][i];
				a[h][i] = temp;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
