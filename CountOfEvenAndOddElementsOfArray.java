package com.kn.arrays;

import java.util.Scanner;

public class CountOfEvenAndOddElementsOfArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		//Array declaration anad Creation
		int[] arr=new int[scan.nextInt()];
		//Array Intialzation
		for(int i=0;i<arr.length;i++) {
		System.out.println("enter the  data for elemet "+(i+1));
		arr[i]=scan.nextInt();

		}
		CountOfTheEvenAndOddElementsOfArrayDemo countEvenOddElements=new CountOfTheEvenAndOddElementsOfArrayDemo();
		System.out.println("#############################");
		countEvenOddElements.countEvenAndOddArrayElements(arr);
		scan.close();
		}
		}