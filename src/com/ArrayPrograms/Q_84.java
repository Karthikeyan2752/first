package com.ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class Q_84 {

	// 84

	static void frequencyOfOddAndEven2(int[][] a) {

		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] % 2 != 0) {
					oddCount++;
				} else {
					evenCount++;
				}
			}
		}
		System.out.println("frequenncy of even numbers: " + evenCount);
		System.out.println("frequenncy of odd numbers: " + oddCount);
	}
	// 84

	static void frequencyOfOddAndEven(int[][] a) {
		Map<Integer, Integer> evenMap = new HashMap<>();
		Map<Integer, Integer> oddMap = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] % 2 != 0) {
					oddMap.put(a[i][j], oddMap.getOrDefault(a[i][j], 0) + 1);
				} else {
					evenMap.put(a[i][j], evenMap.getOrDefault(a[i][j], 0) + 1);
				}
			}
		}
		System.out.println(oddMap.entrySet());
		System.out.println(evenMap.entrySet());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
