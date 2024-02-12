package com.kn.arrays;

import java.util.Scanner;

public class BubbleSortArray {

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
	
	BubbleSortArrayDemo b1 = new BubbleSortArrayDemo();
    int[] crr = b1.sort(arr);

    System.out.println("Sorted Array:");
    for (int i : crr) {
        System.out.print(i);
    }
}
}

	
	
	
//		BubbleSortArrayDemo b1=new BubbleSortArrayDemo();
//		int[] crr=b1.sort(arr);
//		System.out.println("Sorted array are :");
//		for (int i :crr) {
//			System.out.print(i);
//		}
//		
//		
//		
		

	

	


