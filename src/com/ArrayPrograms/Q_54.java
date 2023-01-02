package com.ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_54 {
	// 54

	static int[] alternateSorting2(int[] a) {
		int n = a.length;

		List<Integer> evenPosElements = new ArrayList<>();
		List<Integer> oddPosElements = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if ((i + 1) % 2 == 0) {
				evenPosElements.add(a[i]);
			} else {
				oddPosElements.add(a[i]);
			}
		}

		Collections.sort(oddPosElements, Collections.reverseOrder());
		Collections.sort(evenPosElements);

		for (int i = 0; i < n; i++) {
			if (!(oddPosElements.isEmpty())) {
				a[i] = oddPosElements.get(0);
				oddPosElements.remove(0);
			}
			if (!(evenPosElements.isEmpty()) && i < n - 1) {
				a[++i] = evenPosElements.get(0);
				evenPosElements.remove(0);
			}
		}

		return a;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
