package com.ArrayPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Q_67 {
	// 67

	static void printDuplicates2(int a[]) {
		Set<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {

			if (!s.contains(a[i])) {
				s.add(a[i]);
			} else {
				System.out.print(a[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
