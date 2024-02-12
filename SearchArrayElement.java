package com.kn.arrays;

import java.util.Scanner;

public class SearchArrayElement {

	
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				// Array Declaration and Creation
				System.out.println("enter a size of array");
				int[] arr;
				arr = new int[(scan.nextInt())];

		//  Array initialization
		//
				for (int i = 0; i < arr.length; i++) {
					System.out.println("enter a elements " + (i + 1) + "");
					arr[i] = scan.nextInt();
				}
				System.out.println("enter a element to search");
				int elem = scan.nextInt();
				boolean flag = isPresentelemnt(arr, elem);
				if (flag) {
					System.out.println("element found : " + elem);
				} else {
					System.out.println("element not found : " + elem);
				}
			}

			private static boolean isPresentelemnt(int[] arr, int elem) {
				boolean flag = false;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == elem) {
						System.out.println(arr[i]);
					}
				}
				return true;
			}

		}