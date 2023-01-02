package com.functionalities;

public class Functionalities {

	// 4

	void bitwiseOperators() {

		int a = 10, b = 5;
		// AND
		int c = a & b; // 0 (0000 in binary)
		System.out.println("a & b = " + c);

		// OR
		c = a | b; // 15 (1111 in binary)
		System.out.println("a | b = " + c);

		// XOR
		c = a ^ b; // 15 (1111 in binary)
		System.out.println("a ^ b = " + c);

		// NOT
		c = ~a; // -11 (1111 0101 in binary)
		System.out.println("~a = " + c);

		// leftShift
		c = a << 1; // 20 (10100 in binary)
		System.out.println("a << 1 = " + c);

		// RightShift
		c = a >> 1; // 5 (101 in binary)
		System.out.println("a >> 1 = " + c);
	}

	// 8

	static int i = 1;
	int j = 2;

	static void staticFunctionalities(int i) {
		System.out.println(i);
	}

	void staticFunctionalities1(int j) {
		System.out.println(j);
	}

	public static void main(String[] args) {
		// we can call the static method without creating an instance
		staticFunctionalities(i);

		// we cannot call method without creating an instance

		Functionalities f = new Functionalities();
		// f.staticFunctionalities1(j);
		/*
		 * the above will show a compilation error because j is a non static variable,
		 * even though we create an instance this will show compilation error,since main
		 * method is static.
		 */

		// staticFunctionalities1(i);
		// the above line will show compilations error

		// staticFunctionalities(j);
		/*
		 * the above line will show compilation error because we cannot use a non-static
		 * variable j in static method staticFunctionalities();
		 */

	}
	// 26

	static void longDemo() {
		long l = 123456l;
		int i = 35;
		byte b = 15;
		// we can add the integer,byte and long value
		long a = i + b + l;
		/*
		 * l is necessary because every no. without a decimal point is considered as a
		 * int data type Also, long is a 64 bit data type, where int is only 32 bit
		 */

	}

}
