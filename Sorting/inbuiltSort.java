package Sorting;

import java.util.*;
public class inbuiltSort {
  public static void main(String[] args) {
    //array
    int arr[] = { 5, 3, 4, 2, 1 };
    //sorting 
    Arrays.sort(arr);
    //print
    System.out.print("Sorted Array :");
    print(arr);
    //reverse sorting 
    // Arrays.sort(arr, Collections.reverseOrder());
    // //print
    // System.out.print("Reverse Sorted Array :");
    // print(arr);
  }
  
  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " " );
    }
  }
}

