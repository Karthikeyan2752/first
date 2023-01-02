package com.ArrayPrograms;

public class Q_87 {

	// 87

	static String toString1(char[] ch) {
		String s = "";
		for (char c : ch) {
			s += c;
		}

		return s;
	}

	static String toString2(char[] ch) {
		String s = new String(ch);

		return s;
	}

	static String toString3(char[] ch) {
		String s = String.valueOf(ch);

		return s;
	}

	static String toString4(char[] ch) {
		String s = String.copyValueOf(ch);

		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
