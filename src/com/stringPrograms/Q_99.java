package com.stringPrograms;

public class Q_99 {

	// 99

	static String toCapitalLetters2(String s) {
		char[] alphabets = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result += alphabets[s.charAt(i) - 'a'];
		}
		return result;
	}

	static String toCapitalLetters(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append((char) (s.charAt(i) - 32));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
