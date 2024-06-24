package Sorting;

public class selectionSort {
  public static void main(String[] args) {
    //array
    int arr[] = { 5, 3, 4, 2, 1 };
    //sorting 
    for (int i = 0; i < arr.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minPos] > arr[j]) {
          //find position of the minimum element
          minPos = j;
        }
      }
      // swap to fit at right position
      int temp = arr[i];
      arr[i] = arr[minPos];
      arr[minPos] = temp;
    }
    //print
    System.out.print("Sorted Array :");
    print(arr);
  }
  
  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " " );
    }
  }
}

