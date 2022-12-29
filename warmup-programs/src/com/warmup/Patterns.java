package com.warmup;

public class Patterns {
	// 2
	void printAlphabets(char c) {
		while (c <= 'Z') {
			System.out.println(c);
			c++;
		}
	}

	// 5
	void printPattern1(char c) {
		while (c >= 'A') {
			for (int i = c - 'A' + 1; i > 0; i--) {
				System.out.print(c);
			}
			System.out.println();
			c--;
		}
	}

	// 7
	void printPattern2(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i || i + j == n - 1 || i - j == n - 1) {
					System.out.print(s.charAt(i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// 47

	static void printPattern4(int n) {


		for (int i = 0; i < n; i++) {
			int c = 1;
			for (int j = 1; j < n - i; ++j) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print(c+" ");
				c=c*(i-k)/(k+1);
			}
			System.out.println();
		}
	}

	// 48

	static void printPattern5(int n) {
		for (int i = n; i > 0; i--) {
			for (int k = n - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = (i * 2); j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("*");
	}

	// 49

	static void printPattern6(int n) {
		for (int i = n; i > 0; i--) {
			for (int k = n - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = (i * 2); j > 0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	// 50

	static void printPattern7(int n) {
		for (int i = n; i >= 1; i--) {
			for (int a = i - 1; a > 0; a--) {
				System.out.print(" ");
			}

			for (int j = i; j < n; j++) {
				System.out.print(j);
			}
			for (int k = n; k >= i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	// 55

	static void printPattern9(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	// 56

	static void printPattern8(int n) {
		n = (n / 2) + 1;
		int a = 1;
		for (int i = 1; i < n; i++) {

			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k < i; k++) {
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}

	// 57

	void printPattern3(String s) {
		int n = s.length();
		int a = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1 || i - j == n - 1) {
					System.out.print(s.charAt(a));
					a--;
				} else if (i == j) {
					System.out.print(s.charAt(i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
}

// 58

static void printPattern10(int n) {
	int stars = (n / 2) + 1;
	int iphens = 0;
	for (int i = 0; i < n; i++) {

		for (int j = 1; j <= stars; j++) {
			System.out.print("*");
		}
		for (int k = 1; k <= iphens; k++) {
			System.out.print("-");
		}
		for (int j = 1; j <= stars; j++) {
			System.out.print("*");
		}

		if (i < (n / 2) + 1) {
			stars--;
			iphens += 2;
		}
		if (i > (n / 2) + 1) {
			stars++;
			iphens -= 2;
		}
		if (i == (n / 2) + 1) {
			stars = 2;
			iphens = n - 3;
		}
		System.out.println();
	}

	}

public static void main(String[] args) {
	printPattern10(11);
}
}
