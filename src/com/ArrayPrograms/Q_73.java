package com.ArrayPrograms;

public class Q_73 {
	// 73

	static void addMatrices(int[][] a, int[][] b) {
		if (a.length != b.length && a[0].length != b[0].length) {
			System.out.println("matrix should be in equal size");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] += b[i][j];
			}
		}
	}
	// 73

	static void addMatrices2(int[][] a, int[][] b) {
		if (a.length != b.length && a[0].length != b[0].length) {
			System.out.println("matrix should be in equal size");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = Integer.sum(a[i][j], b[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
