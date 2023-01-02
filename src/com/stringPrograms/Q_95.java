package com.stringPrograms;

public class Q_95 {

	// 95

	static boolean isPalindrome(String a) {
		StringBuilder sb = new StringBuilder(a);
		sb.reverse();
		return sb.toString().equals(a);
	}

	static boolean isPalindrome2(String a) {
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
		// TODO Auto-generated method stub

	}

}
