package com.kn.arrays;

public class BinarySearchArrayDemo {
	public  void toBinaryArraySearch(int[] arr, int element) {
		int postion = -1;
		boolean isElementFound = false;
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (element == arr[mid]) {
				isElementFound = true;
				postion = mid + 1;
				break;
			} else if (element > arr[mid]) {
				low = mid + 1;
				high = high;
			} else {
				low = low;
				high = mid - 1;
			}

		}
		if (isElementFound == false) {
			System.out.println("Element not found");
		} else {
			System.out.println("The Element " + element + " is found at position " + postion);
		}
		
	}

}
