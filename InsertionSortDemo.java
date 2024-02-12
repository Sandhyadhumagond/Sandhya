package com.kn.arrays;

import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter size of array");
		int[] arr= new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter element no : "+(i+1));
			arr[i]=scan.nextInt();
		}
		
		InsertionSort i1=new InsertionSort();
		int brr[]=i1.insertionSortElement(arr);
		scan.close();
		for(int i:brr) {
			System.out.print(i+" ");
		}
	}

}
