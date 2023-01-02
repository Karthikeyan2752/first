package com.karthikeyan;

public class Q_35 {
	// 35

	static void factorial(int n) {

		for (int i = n - 1; i > 0; i--) {
			n *= i;
		}
		System.out.println("factorial : " + n);
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println("Sum of digits : " + sum);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
