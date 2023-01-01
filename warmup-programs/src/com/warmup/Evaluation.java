package com.warmup;

public class Evaluation {
	// 16

	// 31
	static void root(double a, double b, double c) {

		double r1, r2;

		// discriminate d = (b*b) - 4ac
		double d = (b * b) - 4 * a * c;

		if (d == 0) {// the roots are real and equal

			System.out.println("roots are real and equal");
			r1 = r2 = -b / (2 * a);

			System.out.println("R1 = " + r1);
			System.out.println("R2 = " + r2);

		} else if (d > 0) {

			System.out.println("roots are real and distinct");
			r1 = (-b + Math.sqrt(d)) / (2 * a);
			r2 = (-b - Math.sqrt(d)) / (2 * a);

			System.out.println("R1 = " + r1);
			System.out.println("R2 = " + r2);

		} else {

			System.out.println("roots are distinct and imaginary");
			double x = -b / (2 * a);
			double y = Math.sqrt(-d) / (2 * a);

			System.out.println("R1 = " + x + "+i" + y);
			System.out.println("R2 = " + x + "-i" + y);
		}

	}


	public static void main(String[] args) {

		// 18

		int a = 1, b = 2;
		// (i)
		System.out.println(++a - b--);
		// (ii)
		System.out.println(a % b++);
		// (iii)
		System.out.println(a *= b + 5);
		// (iv)
		System.out.println(20 >>> 2);

		// 19

		a = 28;
		a += a++ + ++a + --a + a--;
		System.out.println(a);

		// 20

		int x = 2;
		x = x++ * 2 + 3 * --x;
		System.out.println(x);

		// 21

		int y = 10;
		int z = (++y * (y++ + 5));
		System.out.println(z);

		// 23

		x = 5;
		int x1 = ++x - x++ + --x;
		System.out.println(x1);

	}

}
