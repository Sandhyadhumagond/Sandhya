package com.kn.arrays;

import java.util.Scanner;

public class SelectionSortArrayElement {

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
		System.out.println("Before selection sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		for(int i=0;i<arr.length;i++)
		{   
			int min=arr[i],temp=0,index=i;
			for(int j=i+1;j<arr.length-i-1;j++)
			{
				
				if(arr[j]<min)
				{
					min=arr[j];
					index=j;
					
					
						
				}
			}
			temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
				
		}
		
		System.out.println();
		System.out.println("After Selection sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
