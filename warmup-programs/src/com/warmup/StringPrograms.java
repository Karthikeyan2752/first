package com.warmup;

import java.util.Arrays;

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
	
	// 91

	static String sortInDescending(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String str = "";
		for (int i = s.length() - 1; i > 0; i--) {
			str += c[i];
		}
		return str;
	}

	// 92

	static String[] mergeSortWords(String[] Arr, int lo, int hi) {
		if (lo == hi) {
			String[] A = { Arr[lo] };
			return A;
		}
		int mid = lo + (hi - lo) / 2;
		String[] arr1 = mergeSortWords(Arr, lo, mid);
		String[] arr2 = mergeSortWords(Arr, mid + 1, hi);

		String[] arr3 = merge(arr1, arr2);
		return arr3;
	}

	private static String[] merge(String[] Arr1, String[] Arr2) {
		int m = Arr1.length;
		int n = Arr2.length;
		String[] Arr3 = new String[m + n];

		int idx = 0;

		int i = 0;
		int j = 0;

		while (i < m && j < n) {
			if (isAlphabeticallySmaller(Arr1[i], Arr2[j])) {

				Arr3[idx] = Arr1[i];
				i++;
				idx++;
			} else {
				Arr3[idx] = Arr2[j];
				j++;
				idx++;
			}
		}
		while (i < m) {
			Arr3[idx] = Arr1[i];
			i++;
			idx++;
		}
		while (j < n) {
			Arr3[idx] = Arr2[j];
			j++;
			idx++;
		}
		return Arr3;
	}

	private static boolean isAlphabeticallySmaller(String str1, String str2) {
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		if (str1.compareTo(str2) < 0) {
			return true;
		}
		return false;
	}

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
	
	// 95

	static boolean isPalindrome(String a) {
		StringBuilder sb = new StringBuilder(a);
		sb.reverse();
		return sb.toString().equals(a);
	}

	// 96

	static void findCharacter(char c, String s) {
		for (char ch : s.toCharArray()) {
			if (ch == c) {
				System.out.println(c);
				return;
			}
		}
	}

	// 97

	static char findCharacterUsingBS(char c, String s) {
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		
		int l = 0, e = s.length() - 1;
		
		for (int i = 0; i < s.length(); i++) {

			int m = l + (e - l) / 2;

			if (ch[m] == c) {
				return ch[m];
			} else if (c < ch[m]) {
				e = m - 1;
			} else {
				l = m + 1;
			}
		}
		return '0';

	}

	// 98

	static void printEquivalentCapitalLetter(char c) {
		System.out.println((char) (c - 32));
	}

	// 99

	static String toCapitalLetters(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append((char) (s.charAt(i) - 32));
		}
		return sb.toString();
	}

	// 100

	static void ASCIIToChar(int ascii) {
		System.out.println((char) ascii);
	}

	public static void main(String[] args) {
		System.out.println(sortInDescendingRecursive("abcdaadef"));

	}
}
