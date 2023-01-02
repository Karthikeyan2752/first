package com.stringPrograms;

public class Q_59 {
	// 59
	
	static int isSubstring(String s1, String s2) {
		int index = s1.indexOf(s2);
		if (index >= 0) {
			return index;
		}
		return -1;
	}
}

