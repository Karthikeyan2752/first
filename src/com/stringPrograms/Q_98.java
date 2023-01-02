package com.stringPrograms;

public class Q_98 {
	// 98

	static void printEquivalentCapitalLetter2(char c) {
		char[] alphabets = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		System.out.println(alphabets[c - 'a']);
	}

	static void printEquivalentCapitalLetter(char c) {
		System.out.println((char) (c - 32));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
