/**
 * 
 */
package com.kn.arrays;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");

		// Array Declaration & Creation
		int[] arr = new int[scan.nextInt()];
		int[] brr = new int[scan.nextInt()];

		// Array Initialization

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element " + (i + 1) + " data");
			arr[i] = scan.nextInt();

		}
		for (int i = 0; i < brr.length; i++) {
			System.out.println("enter element " + (i + 1) + " data");
			brr[i] = scan.nextInt();

		}
		int[] crr=mergeTwoArray(arr,brr);
		
		//Array traversing
		
		System.out.println("First array elements :");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Second array elements:");
		for(int i:brr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The Merged array elements :");
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]+" ");
		}
	}

	public static int[] mergeTwoArray(int[] arr, int[] brr) {
		int[] crr=new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++)
		{
			crr[i]=arr[i];
		}
		int j=0;
		for(int i=arr.length;i<crr.length;i++)
		{
			crr[i]=brr[j];
			j++;
		}
		return crr;
	}
	

}
