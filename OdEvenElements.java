package com.kn.arrays;

import java.util.Scanner;

public class OdEvenElements {

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
		oddEvenElemts(arr);
	}

	private static void oddEvenElemts(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("even element " + arr[i]);
			} else {
				System.out.println("odd elements " + arr[i]);
			}
		}

	}

}
