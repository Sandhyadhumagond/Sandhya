
//***********************************Print array elements*********************************

package com.kn.arrays;

import java.util.Scanner;

/**
 * 
 */
public class ArrayTask1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");

// Array Declaration & Creation
		int[] arr = new int[scan.nextInt()];

// Array Initialization

		System.out.println("enter elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();

			// Array Traversing
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The elements are : " + arr[i] + " ");
		}

	}
}
