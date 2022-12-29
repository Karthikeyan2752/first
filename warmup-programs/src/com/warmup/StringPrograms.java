package com.warmup;

public class StringPrograms {

	// 52

	static String reverse(String s) {
		int k = s.indexOf(" ");
		if (k == -1) {
			return s;
		} else {
			return reverse(s.substring(k + 1)) + " " + s.substring(0, k);
		}
	}
	
	//53
	
	static void printWithFrequency(String s) {
		char[] ch = s.toCharArray();
		char t;
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				t = ch[i - 1];
				while (ch[i] >= '0' && ch[i] <= '9') {
					c = c * 10 + (ch[i] - 48);
					i++;
					if (i >= ch.length) {
						break;
					}
				}
				for (int j = 0; j < c; j++) {
					System.out.print(t);
				}
				c = 0;
			}
		}
	}

	// 59

	static int isSubstring(String s1, String s2) {
		int index = s1.indexOf(s2);
		if (index >= 0) {
			return index;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		printWithFrequency("z10b2j01");

	}
}
