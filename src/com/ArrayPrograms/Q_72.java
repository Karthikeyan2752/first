package com.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Q_72 {
	// 72

	static void removeDuplicates2(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int i : a) {
			set.add(i);
		}

		int[] b = new int[set.size()];
		System.out.println(Arrays.toString(b));
	}
	// 72

	static void removeDuplicates(int a[]) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(a);
		list.add(a[0]);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				list.add(a[i + 1]);
			}
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
