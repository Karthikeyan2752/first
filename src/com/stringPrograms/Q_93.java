package com.stringPrograms;

public class Q_93 {
	// 93


	static String sortInDescendingRecursive(String s) {
		char[] ch = s.toCharArray();
		sortInDescendingRecursive(ch, 0, s.length() - 1);
		String result = "";
		for (char c : ch) {
			result += c;
		}
		return result;
	}

	private static void sortInDescendingRecursive(char[] ch, int start, int end) {
		if (start >= end) {
			return;
		}

		int pivotIndex = start + (end - start) / 2;
		char pivot = ch[pivotIndex];
		int left = start;
		int right = end;

		while (left <= right) {
			while (ch[left] > pivot) {
				left++;
			}
			while (ch[right] < pivot) {
				right--;
			}
			if (left <= right) {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		sortInDescendingRecursive(ch, start, right);
		sortInDescendingRecursive(ch, left, end);

	}

	static String sortInDescendingRecursive2(String s) { // recursive
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
