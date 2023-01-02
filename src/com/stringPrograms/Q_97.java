package com.stringPrograms;

import java.util.Arrays;

public class Q_97 {
	// 97

	static int findCharacterUsingBS2(String s, int l, int h, char c) {

		if (h < l) {
			return -1;
		}
		int m = (l + h) / 2;
		char midChar = s.charAt(m);

		if (c == midChar) {
			return m;
		}
		if (c < midChar) {
			return findCharacterUsingBS2(s, l, m - 1, c);
		}
		return findCharacterUsingBS2(s, m + 1, h, c);

	}

	static char findCharacterUsingBS(char c, String s) {
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);

		int l = 0, e = s.length() - 1;

		for (int i = 0; i < s.length(); i++) {

			int m = l + (e - l) / 2;

			if (ch[m] == c) {
				return ch[m];
			} else if (c < ch[m]) {
				e = m - 1;
			} else {
				l = m + 1;
			}
		}
		return '0';

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
