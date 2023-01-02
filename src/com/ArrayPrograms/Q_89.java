package com.ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Q_89 {
	// 89

	static String[] toStrArray2(String s) {
		String regex = "\\s";
		Pattern p = Pattern.compile(regex);
		String[] str1 = p.split(s);

		return str1;
	}


	static String[] toStrArray(String s) {

		Set<String> set = new HashSet<>(Arrays.asList(s));

		String[] str = (String[]) set.toArray();
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
