package com.stringPrograms;

public class Q_52 {
	// 52

	static String reverse(String s) {
		int k = s.indexOf(" ");
		if (k == -1) {
			return s;
		} else {
			return reverse(s.substring(k + 1)) + " " + s.substring(0, k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
