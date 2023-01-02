package com.karthikeyan;

public class Q_60 {
	// 60

	static int sumOfSeries(int n) {
		int a = 1;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += a;
			a = (a * 10) + 1;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
