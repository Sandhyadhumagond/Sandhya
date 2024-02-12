package com.kn.arrays;

public class CountOfTheEvenAndOddElementsOfArrayDemo {
	void  countEvenAndOddArrayElements(int[] arr) {
		int Evencount=0;
		int Oddcount=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
		Evencount++;
		}else {
		Oddcount++;
		}

		}
		System.out.println("total even numbers in arry = "+ Evencount);
		System.out.println("total odd numbers in array = "+ Oddcount);
		}

		}


