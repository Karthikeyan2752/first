package com.karthikeyan;

public class Q_30 {

	// 30
	static int LargerNumber(int a, int b, int c) {
		int largestNumber;
		largestNumber = a > b ? a : b;
		largestNumber = largestNumber > c ? largestNumber : c;
		return largestNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
