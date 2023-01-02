package com.ArrayPrograms;

public class Q_83 {
	// 83

	static void printUpperTriangularMatrix2(int[][] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("  ");

			}

			for (j = a.length - 1; j >= i; j--) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}

	}

	// 83

	static void printUpperTriangularMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i > j) {
					a[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != 0) {
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
