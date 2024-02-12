package com.kn.arrays;

import java.util.Scanner;

public class ReverseArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");

// Array Declaration & Creation
		int[] arr = new int[scan.nextInt()];

// Array Initialization

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element " + (i + 1) + " data");
			arr[i] = scan.nextInt();

			// Array Traversing

		}
		toPrintArrayElementsReverse(arr);

	}

	private static void toPrintArrayElementsReverse(int[] arr) {
		System.out.println("The array elements are :");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
