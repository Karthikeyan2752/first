package com.ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class Q_42 {
	// 42

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
