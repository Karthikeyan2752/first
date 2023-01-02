package com.stringPrograms;

public class Q_92 {
	// 92

	static void insertionSortOfWords(String[] s, int n) {

		if (n <= 1) {
			return;
		}

		insertionSortOfWords(s, n - 1);

		int last = s[n - 1].charAt(0);
		String str = s[n - 1];
		int j = n - 2;

		while (j >= 0 && s[j].charAt(0) > last) {
			s[j + 1] = s[j];
			j--;
		}
		s[j + 1] = str;
	}

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
