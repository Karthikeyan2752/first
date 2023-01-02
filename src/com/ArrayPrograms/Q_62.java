package com.ArrayPrograms;

public class Q_62 {
	// 62

	static void printOddAndevenElements(int[] a) {
		System.out.println("Elements presint in Even position: ");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.print(a[i]);
			}
		}
		System.out.println("Elements presint in Odd position: ");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				System.out.print(a[i]);
			}
		}
	}
	// 62

	static void printOddAndevenElements2(int[] a) {
		System.out.println("elements in even position: ");
		for (int i = 0; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
		System.out.println("elements in odd position: ");
		for (int i = 1; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {

	}
}
