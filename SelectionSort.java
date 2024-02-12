package com.kn.arrays;

public class SelectionSort {
	public int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i], temp = 0, index = i;
			for (int j = i + 1; j < arr.length ; j++) {

				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			//swap 
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;

		}
		return arr;
	}

}
