package com.kn.arrays;

import java.util.Scanner;

public class MaxMinElement {

	public static void main(String[] args) {
		// ***********to accept an from the user &  find max and min number************
		
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
		
		int max=-2147483648, min=2147483647;
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i] + " ");
			if(arr[i]>max)
			{
				max=arr[i];
				
				//System.out.println("The max array element :"+max);
			}
			
			
		
		}
		System.out.println("The max array element :"+max);
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i] + " ");
			if(arr[i]<min)
			{
				min=arr[i];
				
				
			}
			
			
		
		}
		System.out.println("The min array element :"+min);
		
		
		

	}

}
