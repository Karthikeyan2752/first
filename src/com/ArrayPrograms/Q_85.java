package com.ArrayPrograms;

public class Q_85 {
	// 85

	static void rowColumnSum(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < a[0].length; j++) {
				rowSum += a[i][j];
			}
			System.out.println("Sum of " + (i + 1) + " row is " + rowSum);
		}

		for (int i = 0; i < a[0].length; i++) {
			int colSum = 0;
			for (int j = 0; j < a.length; j++) {
				colSum += a[j][i];
			}
			System.out.println("Sum of " + (i + 1) + " column is " + colSum);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
