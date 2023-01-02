package com.ArrayPrograms;

import java.util.Arrays;

public class Q_86 {

	static void printElements2(int[] a) {
		System.out.println(Arrays.stream(a));
	}
	// 86

	static void printElements(int[] a) {
		System.out.println(Arrays.toString(a));
	}

	static void printElements3(int[] a) {
		for (int i : a) {
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
