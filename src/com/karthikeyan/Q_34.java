package com.karthikeyan;

public class Q_34 {
	// 34

	static void sumOfNaturalNumbers(int n) {
		int sum = n * (n + 1) / 2;
		System.out.println(sum);

		int highestDigit = 0;
		while (sum > 0) {
			n = sum % 10;
			if (n > highestDigit) {
				highestDigit = n;
				sum /= 10;
			}
		}
		System.out.println("Largest digit is: " + highestDigit);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
