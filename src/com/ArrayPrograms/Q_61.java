package com.ArrayPrograms;

import java.util.Stack;

public class Q_61 {

	// 61

	static void printInReverse(int[] a) {
		for (int i = a.length - 1; i <= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

	// 61

	static void printInReverseUsingStack(int[] a) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < a.length; i++) {
			s.push(a[i]);
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(s.pop() + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
