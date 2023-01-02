package com.stringPrograms;

import java.util.Arrays;

public class Q_91 {
	// 91

	static String sortInDescending(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String str = "";
		for (int i = s.length() - 1; i > 0; i--) {
			str += c[i];
		}
		return str;
	}
	// 91

	static String sortInDescending2(String s) {
		s = s.toLowerCase();
		int ALPHABETS = 26;
		String result = "";

		int[] frequency = new int[ALPHABETS];
		for (int i = 0; i < s.length(); i++) {
			frequency[s.charAt(i) - 'a']++;
		}
		for (int i = ALPHABETS - 1; i >= 0; i--) {
			for (int j = 0; j < frequency[i]; j++) {
				result += (char) ('a' + i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
