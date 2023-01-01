package com.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayPrograms {

	// 9

	static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] mergedArray = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			} else if (arr1[i] > arr2[j]) {
				mergedArray[k] = arr2[j];
				j++;
			} else {
				mergedArray[k] = arr1[i];
				i++;
				j++;
			}
			k++;
		}
		/*
		 * if two sorted arrays are not in equal length this loop will add the remaining
		 * elements to the mergedArray
		 */
		while (i < arr1.length) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}
		return mergedArray;
	}

	// 10


	static int[] alternateSorting(int[] a) {

		Arrays.sort(a);
		int[] b = new int[a.length];
		int i = 0, j = a.length - 1, k = 0;
		while (i < j) {
			b[k++] = a[j--];
			b[k++] = a[i++];
		}
		if (a.length % 2 != 0) {
			b[k] = a[i];
		}
		return b;
	}

	// 11

	static int[][] rotateLeft2DArray(int[][] a) {
		// transpose of matrix
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		// swapping the rows
		for (int i = 0; i < a.length / 2; i++) {
			int l = 0, h = a.length - 1;
			while (l < h) {
				int temp = a[l][i];
				a[l][i] = a[h][i];
				a[h][i] = temp;
			}
		}
		return a;
	}

	static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 36

	static void printElementsInEven(int[] a) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

	// 37

	static void printElementsInOdd(int[] a) {
		for (int i = 1; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

	// 38

	static int largestElement(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i : a) {
			max = Math.max(a[i], max);
		}
		return max;
	}

	// 39

	static int smallestElement(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i : a) {
			min = Math.min(a[i], min);
		}
		return min;
	}

	// 40

	static int lengthOfArray(int[] a) {
		int count = 0;
		for (int i : a) {
			count++;
		}
		return count;
	}

	// 41

	static int[] copyElements(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}

	// 42

	static Map<Integer, Integer> frequencyOfElements(int[] a) {
		Map<Integer, Integer> map = new HashMap();

		for (int i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		return map;
	}

	// 43

	static int[] leftRotate(int[] a) {
		int temp = a[0]; // temp variable for storing the first element of the array
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = temp; // using the temp variable

		return a;
	}

	// 44

	static void printDuplicates(int[] a) {

		Map<Integer, Integer> frequencyMap = frequencyOfElements(a); // calculating the frequency using the helper
																		// method

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	// 45

	static void printSumOfElements(int[] a) {
		int sum = 0;

		for (int i : a) {
			sum += i;
		}
		System.out.println(sum);
	}

	// 46

	static int[] rightRotate(int[] a) {

		int temp = a[a.length - 1];

		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = temp;
		return a;
	}

	// 54

	static int[] alternateSorting2(int[] a) {
		// sorting the array
		List<Integer> evenPosElements = new ArrayList<>();
		List<Integer> oddPosElements = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				evenPosElements.add(a[i]);
			} else {
				oddPosElements.add(a[i]);
			}
		}

		Collections.sort(evenPosElements);
		Collections.sort(oddPosElements);
		Collections.reverse(oddPosElements);
		
		int i = 0, j = 0, k = 0;
		while (i < a.length) {
			if (i % 2 == 0) {
				a[i++] = evenPosElements.get(j++);
			} else {
				a[i++] = oddPosElements.get(k++);
			}
		}

		return a;

	}

	// 61

	static void printInReverse(int[] a) {
		for (int i = a.length - 1; i <= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}



	// 62

	static void printOddAndevenElements(int[] a) {
		System.out.println("Elements presint in Even position: ");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.print(a[i]);
			}
		}
		System.out.println("Elements presint in Odd position: ");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				System.out.print(a[i]);
			}
		}
	}

	// 63

	static void minAndMax(int[] a) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("maximum element: " + max + "\nminimum element: " + min);
	}

	// 64

	static int[] copyElements2(int[] a) {
		int[] b = new int[a.length];
		int i = 0;
		while (i < a.length) {
			b[i] = a[i];
		}
		i++;
		return b;
	}

	// 65

	static void frequency(int[] a) {
		int[] f = new int[a.length];
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int temp = a[0];
		int fr = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == temp) {
				f[fr]++;
			} else {
				temp = a[i];
				fr++;
			}
		}
		fr = 0;
		for (int i = 0; i < a.length; i++) {
			if (!s.contains(a[i])) {
				s.add(a[i]);
				System.out.println(a[i] + " occurs " + (f[fr++] + 1) + " times.");

			}
		}
	}

	// 66

	static void leftRotate2(int a[], int d) { // d is number of rotations
		int n = a.length;
		d %= n;
		int i, j, k, temp;

		int gcd = gCD(d, n);

		for (i = 0; i < gcd; i++) {
			temp = a[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n) {
					k = k - n;
				}
				if (k == i) {
					break;
				}
				a[j] = a[k];
				j = k;
			}
			a[j] = temp;
		}

		System.out.println(Arrays.toString(a));

	}


	private static int gCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gCD(b, a % b);
	}

	// 67

	static void printDuplicates2(int a[]) {
		Set<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {

			if (!s.contains(a[i])) {
				s.add(a[i]);
			} else {
				System.out.print(a[i] + " ");
			}
		}
	}

	// 68

	static void arraySum(int[] a) {
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
	}

	// 69

	static void rightRotate2(int[] a, int d) {
		if (d > a.length) {
			d %= a.length;
		}
		int k = 0;
		int mid = a.length - d;
		int n = a.length;
		int[] b = new int[a.length];

		for (int i = mid; i < n; i++) {
			b[k++] = a[i];
		}
		for (int j = 0; j < mid; j++) {
			b[k++] = a[j];
		}
		System.out.println(Arrays.toString(b));

	}
	
	//70
	
	static int secondLargestElement(int []a) {
		Arrays.sort(a);
		return a[a.length-2];
	}
	
	//71
	
	static int secondSmallestElement(int[] a) {
		Arrays.sort(a);
		return a[1];
	}

	// 72

	static void removeDuplicates(int a[]) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(a);
		list.add(a[0]);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				list.add(a[i + 1]);
			}
		}
		System.out.println(list);
	}

	// 73

	static void addMatrices(int[][] a, int[][] b) {
		if (a.length != b.length && a[0].length != b[0].length) {
			System.out.println("matrix should be in equal size");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] += b[i][j];
			}
		}
	}

	// 74

	static void multiplyMatrices(int[][] a, int[][] b) {
		if (a.length != b.length && a[0].length != b[0].length) {
			System.out.println("matrix should be in equal size");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] *= b[i][j];
			}
		}
	}

	// 75

	static void printOddAndEven(int[] a) {
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		for (int i : a) {
			if (i % 2 != 0) {
				oddList.add(i);
			} else {
				evenList.add(i);
			}
		}
		System.out.println("Even numbers: ");
		System.out.println(evenList);
		System.out.println("Odd numbers: ");
		System.out.println(oddList);
	}

	// 76

	static void printTranspose(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}

	// 78

	static void subractMatrices(int[][] a, int[][] b) {
		if (a.length != b.length && a[0].length != b[0].length) {
			System.out.println("matrix should be in equal size");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] -= b[i][j];
			}
		}
	}

	// 77

	static void insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {

			int current = a[i];
			int j = i - 1;

			while (a[j] > current && j >= 0) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = current;
		}
		System.out.println(Arrays.toString(a));

	}

	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

	static void mergeSort(int[] arr, int left, int right) {

		if (left >= right) {
			return;
		}

		int mid = left + (right - left) / 2;

		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);

		int leftArrayStarting = left;
		int rightArrayStarting = mid + 1;

		int leftHalf[] = new int[mid - left + 1];// A
		int rightHalf[] = new int[right - mid];// B

		for (int i = 0; i < leftHalf.length; ++i) {
			leftHalf[i] = arr[leftArrayStarting + i];
		}
		for (int j = 0; j < rightHalf.length; ++j) {
			rightHalf[j] = arr[rightArrayStarting + j];
		}

		int index = left;
		int p1 = 0;
		int p2 = 0;
		while (p1 < leftHalf.length && p2 < rightHalf.length) {
			if (leftHalf[p1] <= rightHalf[p2]) {
				arr[index++] = leftHalf[p1];
				p1++;
			} else {
				arr[index++] = rightHalf[p2];
				p2++;
			}
		}
		while (p1 < leftHalf.length) {
			arr[index++] = leftHalf[p1];
			p1++;
		}
		while (p2 < rightHalf.length) {
			arr[index++] = rightHalf[p2];
			p2++;
		}
	}

	static void quickSort(int a[], int start, int end) {
		if (start < end) {
			int partitionIndex = partition(a, start, end);

			quickSort(a, start, partitionIndex - 1);
			quickSort(a, partitionIndex + 1, end);
		}
	}

	private static int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (a[j] <= pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i + 1];
		a[i + 1] = a[end];
		a[end] = temp;

		return i + 1;
	}

	static void bubbleSort(int arr[]) {
		while (true) {
			boolean sorted = true;
			for (int i = 0; i < arr.length - 1; i++)// i i + 1
			{
				if (arr[i] > arr[i + 1]) {
					sorted = false;
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

			if (sorted) {
				break;
			}
		}

	}

	// 79

	static boolean isIdentityMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if ((i == j && a[i][j] != 1) || (a[i][j] != 0 && i != j)) {
					return false;
				}
			}
		}
		return true;
	}

	// 80

	static boolean isSparseMatrix(int[][] a) {
		int zeroCount = 0, numCount = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 0) {
					zeroCount++;
				} else {
					numCount++;
				}
			}
		}
		return zeroCount > numCount ? true : false;
	}

	// 81

	static boolean isEqualMatrix(int[][] a, int[][] b) {

		if (a.length != b.length && a[0].length != b[0].length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	// 82

	static void printLowerTriangularMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (j <= i) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	// 83

	static void printUpperTriangularMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i > j) {
					a[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != 0) {
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println(" ");
		}
	}
	
	//84
	
	static void frequencyOfOddAndEven(int[][] a) {
		Map<Integer, Integer> evenMap = new HashMap<>();
		Map<Integer, Integer> oddMap = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] % 2 != 0) {
					oddMap.put(a[i][j], oddMap.getOrDefault(a[i][j], 0) + 1);
				} else {
					evenMap.put(a[i][j], evenMap.getOrDefault(a[i][j], 0) + 1);
				}
			}
		}
		System.out.println(oddMap.entrySet());
		System.out.println(evenMap.entrySet());
	}

	// 85

	static void rowColumnSum(int[][]a) {
		for(int i=0;i<a.length;i++) {
			int rowSum = 0;
			for(int j=0;j<a[0].length;j++) {
				rowSum+=a[i][j];
			}
			System.out.println("Sum of "+(i+1)+" row is "+rowSum);
		}
		
		
		for (int i = 0; i < a[0].length; i++) {
			int colSum =0;
			for (int j = 0; j < a.length; j++) {
				colSum+=a[j][i];
			}
			System.out.println("Sum of "+(i+1)+" column is "+colSum);
		}
		
	}

	// 86

	static void printElements(int[] a) {
		System.out.println(Arrays.toString(a));
	}

	static void printElements3(int[] a) {
		for (int i : a) {
			System.out.print(i);
		}
	}

	// 87

	static String toString1(char[] ch) {
		String s = "";
		for (char c : ch) {
			s += c;
		}

		return s;
	}

	// 88

	static String[] toStrArrayUsingStringFunctions(String s) {
		String[] str = s.split(" ");
		return str;
	}

	// 89
	static String[] toStrArray(String s) {

		Set<String> set = new HashSet<>(Arrays.asList(s));

		String[] str = (String[]) set.toArray();
		return str;
	}

	// 90

	static String[] lexSortAscending(String s) {
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			char min = a[i].charAt(i);
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].charAt(i) < min) {
					min = a[j].charAt(i);
					minIndex = j;
				}
			}
			String temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		return a;

	}

	public static void main(String[] args) {
		int[] a2 = { 13,12,87,9,45 };
		int[] b2 = { 1, 2, 3, 4, 5, 9, 7, 10 };
		char[] c = { 'a', 'b', 'c', 'f', 'r' };
		int[][] a = { { 1, 2, 3, 3 }, { 4, 4, 5, 6 }, { 7, 9, 8, 9 } };
		int[][] b = { { 1, 1, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		System.out.println(Arrays.toString(alternateSorting2(a2)));

	}
}
