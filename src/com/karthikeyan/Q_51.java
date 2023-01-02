package com.karthikeyan;

public class Q_51 {
	// 51
	private int reverse(int n) {
		int a = 0, r = 0;
		while (n > 0) {
			r = n % 10;
			a = (a * 10) + r;
			n /= 10;
		}
		return a;

	}
	public static void main(String[] args) {


	}

}
