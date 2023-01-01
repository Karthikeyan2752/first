package com.warmup2;

public class StringPrograms2 {

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

	// 93

	static String sortInDescendingRecursive(String s) { // recursive
		if (s == null || s.length() <= 0) {
			return s;
		}

		char first = s.charAt(0);
		String rest = s.substring(1);

		String sortedRest = sortInDescendingRecursive(rest);

		int pos = sortedRest.length();
		for (int i = 0; i < sortedRest.length(); i++) {
			if (sortedRest.charAt(i) > first) {
				pos = i;
				break;
			}
		}
		String result = sortedRest.substring(0, pos) + first + sortedRest.substring(pos);
		return result;
	}

	// 95

	static boolean isPalindrome(String a) {
		int i = 0, j = a.length() - 1;
		while (i < j) {
			if (a.charAt(i) != a.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(sortInDescending2("bcdabADF"));
	}
}
