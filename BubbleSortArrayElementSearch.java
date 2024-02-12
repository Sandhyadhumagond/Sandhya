package com.kn.arrays;

import java.util.Scanner;

public class BubbleSortArrayElementSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter size of array");

		// Array Declaration & Creation
		int[] arr = new int[scan.nextInt()];

		// Array Initialization

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element no " + (i + 1) + ": ");
			arr[i] = scan.nextInt();

		}

		// Array Traversing
		System.out.println("Before sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int temp = 0;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count = 1;
					
				}
			}
			if (count == 0) {
				break;
			}

		}
		System.out.println();
		System.out.println("After sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
