package com.stringPrograms;

public class Q_96 {
	// 96

	static void linearSearch(char c, String s) {
		int i = 0;
		for (; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				System.out.println(c);
				break;
			}
		}
	}

	static char linearSearch2(String s, char ch) {
		for (char c : s.toCharArray()) {
			if (c == ch) {
				return c;
			}
		}
		return '0';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
