package com.stringPrograms;

public class Q_53 {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
