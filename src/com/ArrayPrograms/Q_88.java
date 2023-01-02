package com.ArrayPrograms;

public class Q_88 {
	// 88

	static String[] toStrArrayUsingStringFunctions(String s) {
		String[] str = s.split(" ");
		return str;
	}
	// 88

	static String[] toStrArrayUsingStringFunctions2(String s) {
		String[] str = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			str[i] = Character.toString(s.charAt(i));
		}
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
