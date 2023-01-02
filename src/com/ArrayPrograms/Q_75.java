package com.ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class Q_75 {

	// 75

	static void printOddAndEven(int[] a) {
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		for (int i : a) {
			if (i % 2 != 0) {
				oddList.add(i);
			} else {
				evenList.add(i);
			}
		}
		System.out.println("Even numbers: ");
		System.out.println(evenList);
		System.out.println("Odd numbers: ");
		System.out.println(oddList);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
