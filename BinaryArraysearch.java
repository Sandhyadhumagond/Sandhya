package com.kn.arrays;

import java.util.Scanner;

public class BinaryArraysearch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter size of array");

		// Array Declaration & Creation
		int[] arr = new int[scan.nextInt()];

		// Array Initialization

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element " + (i + 1) + " data");
			arr[i] = scan.nextInt();

		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("enter a element:");
		int element = scan.nextInt();

		int postion = -1;
		boolean isElementFound = false;
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (element == arr[mid]) {
				isElementFound = true;
				postion = mid + 1;
				break;
			} else if (element > arr[mid]) {
				low = mid + 1;
				high = high;
			} else {
				low = low;
				high = mid - 1;
			}

		}
		if (isElementFound == false) {
			System.out.println("Element not found");
		} else {
			System.out.println("The Element " + element + " is found at position " + postion);
		}
	}

}
