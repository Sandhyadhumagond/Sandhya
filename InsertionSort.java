package com.kn.arrays;

import java.util.Scanner;

public class InsertionSort {
	public int[] insertionSortElement(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i],j=i-1;
			while (j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			
				
			}
			arr[j+1]=temp;
		}
		return arr;
	}
	
}

	
			