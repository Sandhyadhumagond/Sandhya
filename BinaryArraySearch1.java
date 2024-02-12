package com.kn.arrays;

import java.util.Scanner;

public class BinaryArraySearch1 {
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
		System.out.println("enter a element to find:");
		int element = scan.nextInt();
		
		
		BinarySearchArrayDemo foundElement=new BinarySearchArrayDemo();
		
		foundElement.toBinaryArraySearch(arr,element);
		scan.close();

}

	}
