package com.stringPrograms;

public class Q_94 {
	// 94

	static boolean isAnagram(String a, String b) {

		if (a.length() != b.length()) {
			return false;
		}
		a.toLowerCase();
		b.toLowerCase();

		int alphabets = 26;
		int[] frequency = new int[alphabets];
		for (int i = 0; i < a.length(); i++) {
			frequency[a.charAt(i) - 'a']++;
			frequency[b.charAt(i) - 'a']++;
		}
		for (int i = 0; i < alphabets; i++) {
			if (frequency[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isAnagram2(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			count += s1.charAt(i);
		}
		for (int j = 0; j < s2.length(); j++) {
			count -= s2.charAt(j);
		}
		return count == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
