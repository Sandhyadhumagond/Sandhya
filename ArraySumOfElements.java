package com.kn.arrays;

import java.util.Scanner;

public class ArraySumOfElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");

// Array Declaration & Creation
		int[] arr = new int[scan.nextInt()];
		int[] brr = new int[arr.length];
		//int[] crr = new int[arr.length];

// Array Initialization

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element " + (i + 1) + " data");
			arr[i] = scan.nextInt();

			// Array Traversing

		}
		for (int i = 0; i < brr.length; i++) {
			System.out.println("enter element " + (i + 1) + " data");
			brr[i] = scan.nextInt();
		}

		int[] drr=toSumOfArrayElements(arr, brr);
		for(int i=0;i<drr.length;i++)
		{
			System.out.println("The sum of elements are : "+drr[i]);
		}

	}

	private static int[] toSumOfArrayElements(int[] arr, int[] brr) {
		int[] crr = new int[arr.length];
		
		for (int i = 0; i < crr.length; i++) {
			crr[i] = arr[i] + brr[i];
			
		}
		return crr;

	}

}
