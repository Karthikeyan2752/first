package com.ArrayPrograms;

import java.util.Arrays;

public class Q_90 {
	// 90

	static String[] lexSortAscending(String s) {
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			char min = a[i].charAt(i);
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].charAt(i) < min) {
					min = a[j].charAt(i);
					minIndex = j;
				}
			}
			String temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		return a;

	}

	// 90

	static String[] lexSortAscending2(String str) {
		String[] s = str.split(" ");
		Arrays.sort(s);

		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
