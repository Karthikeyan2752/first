package com.ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class Q_44 {
	// 44

	static void printDuplicates(int[] a) {

		Map<Integer, Integer> frequencyMap = frequencyOfElements(a); // calculating the frequency using the helper
																		// method

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	// helper method
	static Map<Integer, Integer> frequencyOfElements(int[] a) {
		Map<Integer, Integer> map = new HashMap();

		for (int i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
