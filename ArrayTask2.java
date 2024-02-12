
//&*****************************Copy Array elements*************************


package com.kn.arrays;

import java.util.Scanner;

public class ArrayTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");

// Array Declaration & Creation
		int[] arr = new int[scan.nextInt()];
			
// Array Initialization
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element"+(i+1)+"data");
			arr[i]=scan.nextInt();
			
	//Array Traversing	
			toCopyElementsarray(arr);
				}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(+arr[i]+" ");
			}
		
	}

	private static int[] toCopyElementsarray(int[] arr) {
		int[] brr=new int[arr.length];
		System.out.println(" The elements are :");
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=arr[i];
		}
		return brr;
		
	}
}
	