package com.ArrayPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q_65 {
	// 65

	static void frequency(int[] a) {
		int[] f = new int[a.length];
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int temp = a[0];
		int fr = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == temp) {
				f[fr]++;
			} else {
				temp = a[i];
				fr++;
			}
		}
		fr = 0;
		for (int i = 0; i < a.length; i++) {
			if (!s.contains(a[i])) {
				s.add(a[i]);
				System.out.println(a[i] + " occurs " + (f[fr++] + 1) + " times.");

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
