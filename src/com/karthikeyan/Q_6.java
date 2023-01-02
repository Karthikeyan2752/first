package com.karthikeyan;

import java.util.ArrayList;
import java.util.List;

public class Q_6 {
	// 6
	static List<List<Integer>> groupingStudents(int n) {
		int numberOfGroups = n / 5;
		int k = 101;
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < numberOfGroups; i++) {
			result.add(new ArrayList());

		}
		for (int i = 0; i <= numberOfGroups; i++) {
			for (int j = 0; j < numberOfGroups; j++) {
				if (k == n) {
					break;
				}
				result.get(j).add(k++);
			}
		}

		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
