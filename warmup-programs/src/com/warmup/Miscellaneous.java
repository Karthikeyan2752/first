package com.warmup;

import java.util.ArrayList;
import java.util.List;

public class Miscellaneous {
	//1
	void printMultiplicationTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + i * n);
		}
		for (int j = 1; j <= 10; j++) {
			System.out.println(n + " - " + j + " = " + (n - j));
		}

	}

	//3
	int differeneBetweenItsReVerse(int n) {
		return Math.abs(n - reverse(n));
	}
	//51
	private int reverse(int n) {
		int a = 0, r = 0;
		while (n > 0) {
			r = n % 10;
			a = (a * 10) + r;
			n /= 10;
		}
		return a;

	}
	
	static //6
	List<List<Integer>> groupingStudents(int n) {
		int numberOfGroups = n / 5;
		int k =1;
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < numberOfGroups; i++) {
			result.add(new ArrayList());


		}
		for (int i = 0; i <= numberOfGroups; i++) {
			for(int j=0;j<numberOfGroups;j++) {
				if (k == n) {
					break;
				}
				result.get(j).add(k++);
			}
		}

		return result;
	}

	// 12
	static void printtDecimalNumber(double n) {
		// "%.2f" prints two numbers after the decimal point
		System.out.printf("%.2f", n);
	}

	// 24

	static int ASCII(char c) {
		return c - 0;
	}

	// 25

	static void quotientAndRemainder(int dividend, int divisor) {
		System.out.println("Quotient: " + dividend / divisor);
		System.out.println("Remainder: " + dividend % divisor);
	}

	// 27

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	// 28

	static String evenOrOdd(int i) {
		if (i % 2 == 0) {
			return "EVEN";
		}
		return "ODD";
	}

	// 29

	static String vowelOrConsonant(char c) {
		Character.toLowerCase(c);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return "VOWEL";
		}
		return "CONSONANT";
	}

	// 30
	static int LargerNumber(int a, int b, int c) {
		int largestNumber;
		largestNumber = a > b ? a : b;
		largestNumber = largestNumber > c ? largestNumber : c;
		return largestNumber;
	}

	// 32

	static String positiveOrNegative(int n) {
		if (n < 0) {
			return "NEGATIVE";
		}
		return "POSITIVE";
	}

	// 33

	static boolean isAlphabet(char c) {
		if (c <= 'z' && c >= 'a' || c <= 'Z' && c >= 'A') {
			return true;
		}
		return false;
	}

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
		System.out.println(groupingStudents(20));
	}
}

