package com.kn.arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("enter size of array");

	// Array Declaration & Creation
			int[] arr = new int[scan.nextInt()];
			//int[] brr = new int[arr.length];
			//int[] crr = new int[arr.length];

	// Array Initialization

			for (int i = 0; i < arr.length; i++) {
				System.out.println("enter element " + (i + 1) + " data");
				arr[i] = scan.nextInt();

				
	}
			int sum=sumOfArrayElements(arr);

}

	private static int sumOfArrayElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			//System.out.println("The sum of array elements "+sum);
		}
		return sum;
		
	}
}
