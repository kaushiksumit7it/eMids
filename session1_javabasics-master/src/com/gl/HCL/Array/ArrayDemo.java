package com.gl.HCL.Array;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] x; // declares an array of integers
		x = new int[5]; // allocates memory for 5integers
		x[0] = 11;
		x[1] = 21;

		x[4] = 22;
		System.out.println("Element at index 0: " + x[0]);
		System.out.println("Element at index 1: " + x[1]);
		System.out.println("Element at index 2: " + x[2]);
		System.out.println("Element at index 3: " + x[3]);
		System.out.println("Element at index 4: " + x[4]);
	}
}
