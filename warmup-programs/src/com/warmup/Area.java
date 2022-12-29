package com.warmup;

public class Area {

	// 13
	static float areaOfSquare(float a) {
		// area of square = a^2;
		return a * a;
	}

	// 14
	static float areaOfRectangle(float l, float b) {
		return l * b;
	}

	// 15
	static float areaOfCylinder(float r, float h) {
		float area;
		// area of cylinder = (2*22/7*r*h)+(2*22/7*r*r)
		return (2 * (22 / 7) * r) * (h + r);
	}

	// 17
	static double areaOfSpaceBetween2Circles(double r1, double r2) {

		double area1 = 2 * (double) (22 / 7) * r1 * r1;
		double area2 = 2 * (double) (22 / 7) * r2 * r2;

		return Math.abs(area2 - area1);
	}


	public static void main(String[] args) {
		System.out.println(areaOfCylinder(8, 9));
	}

}
