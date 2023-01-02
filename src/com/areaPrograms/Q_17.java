package com.areaPrograms;

public class Q_17 {

	// 17
	static double areaOfSpaceBetween2Circles(double r1, double r2) {

		double area1 = 2 * (double) (22 / 7) * r1 * r1;
		double area2 = 2 * (double) (22 / 7) * r2 * r2;

		return Math.abs(area2 - area1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
