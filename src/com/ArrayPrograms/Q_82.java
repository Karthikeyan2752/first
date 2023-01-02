package com.ArrayPrograms;

public class Q_82 {

	// 82

	static void printLowerTriangularMatrix2(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	// 82

	static void printLowerTriangularMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (j <= i) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
