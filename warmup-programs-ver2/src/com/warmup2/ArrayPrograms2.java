package com.warmup2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.regex.Pattern;

public class ArrayPrograms2 {

	// 61

	static void printInReverseUsingStack(int[] a) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < a.length; i++) {
			s.push(a[i]);
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(s.pop() + " ");
		}
	}

	// 62

	static void printOddAndevenElements(int[] a) {
		System.out.println("elements in even position: ");
		for (int i = 0; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
		System.out.println("elements in odd position: ");
		for (int i = 1; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
	}

	// 63

	static void minAndMax(int[] a) {
		if (a.length == 0) {
			return;
		}
		Arrays.sort(a);
		System.out.println("maximum element: " + a[a.length - 1] + "\nminimum element: " + a[0]);
	}


	// 66

	static void leftRotate3(int a[], int d) {
		if (d == 0) {
			return;
		}

		int n = a.length;
		d %= n;
		reverseArray(a, 0, d - 1);
		reverseArray(a, d, n - 1);
		reverseArray(a, 0, n - 1);

		System.out.println(Arrays.toString(a));

	}

	private static void reverseArray(int a[], int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

	}

	// 69

	static void rightRotate3(int a[], int d) {
		if (d == 0) {
			return;
		}

		int n = a.length;
		d %= n;
		reverseArray(a, 0, n - 1);
		reverseArray(a, 0, d - 1);
		reverseArray(a, d, n - 1);
		System.out.println(Arrays.toString(a));
	}

	// 70

	static int secondLargestElement2(int[] a) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i : a) {
			if (a[i] > max) {
				max2 = max;
				max = a[i];
			}
		}
		return max2;
	}

	// 71

	static int secondSmallestElement2(int[] a) {
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i : a) {
			if (a[i] < min) {
				min2 = min;
				min = a[i];
			}
		}
		return min2;
	}

	// 72

	static void removeDuplicates2(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int i : a) {
			set.add(i);
		}

		int[] b = new int[set.size()];
		System.out.println(Arrays.toString(b));
	}

	// 73

	static void addMatrices2(int[][] a, int[][] b) {
		if (a.length != b.length && a[0].length != b[0].length) {
			System.out.println("matrix should be in equal size");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = Integer.sum(a[i][j], b[i][j]);
			}
		}
	}

	// 80

	static boolean isSparseMatrix2(int[][] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 0) {
					count++;
				} else {
					count--;
				}
			}
		}
		return count > 0;
	}
	// 81

	static boolean isEqualMatrix2(int[][] a, int[][] b) {

		if (a.length != b.length && a[0].length != b[0].length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (Integer.valueOf(a[i][j]).compareTo(Integer.valueOf(b[i][j])) != 0) {
					return false;
				}
			}
		}
		return true;
	}

	// 84

	static void frequencyOfOddAndEven2(int[][] a) {

		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] % 2 != 0) {
					oddCount++;
				} else {
					evenCount++;
				}
			}
		}
		System.out.println("frequenncy of even numbers: " + evenCount);
		System.out.println("frequenncy of odd numbers: " + oddCount);
	}

	// 86

	static void printElements2(int[] a) {
		System.out.println(Arrays.stream(a));
	}

	// 87

	static String toString2(char[] ch) {
		String s = new String(ch);

		return s;
	}

	static String toString3(char[] ch) {
		String s = String.valueOf(ch);

		return s;
	}

	static String toString4(char[] ch) {
		String s = String.copyValueOf(ch);

		return s;
	}

	// 88

	static String[] toStrArrayUsingStringFunctions2(String s) {
		String[] str = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			str[i] = Character.toString(s.charAt(i));
		}
		return str;
	}

	// 89

	static String[] toStrArray2(String s) {
		String regex = "\\s";
		Pattern p = Pattern.compile(regex);
		String[] str1 = p.split(s);

		return str1;
	}

	// 90

	static String[] lexSortAscending2(String str) {
		String[] s = str.split(" ");
		Arrays.sort(s);

		return s;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[][] b = { { 1, 0 }, { 0, 0 } };
		System.out.println(isSparseMatrix2(b));

	}
	
	
}
