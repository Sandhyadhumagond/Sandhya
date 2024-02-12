package com.kn.arrays;

import java.util.Scanner;

public class SelectionSortDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// Array Declaration and creation
		System.out.println("enter a size of array");
		int[] arr=new int[scan.nextInt()];
		
		//Array initilaization
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter a element :"+(i+1));
			arr[i]=scan.nextInt();
		}
		
		
		
		SelectionSort s1=new SelectionSort();
		int[] crr=s1.sort(arr);
		System.out.println("After sorted array elelments :");
		for(int i:crr)
		{
			System.out.print(i+" ");
		}

	}

}
