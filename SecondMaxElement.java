package com.kn.arrays;

import java.util.Scanner;

public class SecondMaxElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		//Array creation and Intialization
		int[] arr=new int[scan.nextInt()];
		//Array Intialization
		for(int i=0;i<arr.length;i++) {
		System.out.println("enter the data for element"+(i+1));
		arr[i]=scan.nextInt();

		}
		findMaxValue(arr);
		}

		private static void findMaxValue(int[] arr) {
		int max=0;
		int max1=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
		    max1=max;
		    max=arr[i];
		}else if(arr[i]>=max1 &&arr[i]<=max) {
		max1=arr[i];
		}

		}
		System.out.println("first lareges elemet ="+max);
		System.out.println("Second largest element ="+max1);
		int min=2147483647;
		int min1=2147483647;;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
		min1=min;
		min=arr[i];
		}else if(arr[i]<min1 && arr[i]>min) {
		min1=arr[i];
		}
		}
		System.out.println("first smallest elemet ="+min);
		System.out.println("Second largest element ="+min1);
		}

		}