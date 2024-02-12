package com.kn.arrays; 
 
import java.util.Scanner; 
 
public class ArrayElementFound { 
 
 public static void main(String[] args) { 
  Scanner scan = new Scanner(System.in); 
  System.out.println("enter size of array"); 
 
  // Array Declaration & Creation 
  int[] arr = new int[scan.nextInt()]; 
 
  // Array Initialization 
 
  for (int i = 0; i < arr.length; i++) { 
   System.out.println("enter element " + (i + 1) + " data"); 
   arr[i] = scan.nextInt(); 
 
  } 
  System.out.println("enter a element"); 
  int element = scan.nextInt(); 
 
  int position = findElement(arr, element); 
  System.out.println("The element found at " + element + "  position " + position); 
 
 } 
 
 private static int findElement(int[] arr, int element) { 
  boolean isFound = false; 
  int position = -1; 
  for (int i = 0; i < arr.length; i++) { 
   if (arr[i] == element) { 
    isFound = true; 
    position = ++i; 
    break; 
 
   } 
 
  } 
  if (isFound) { 
   return position; 
  } else { 
   return -1; 
  } 
 
 } 
 
}
