package Sorting;

public class insertionSort {
  public static void main(String[] args) {
    //array
    int arr[] = { 5, 3, 4, 2, 1 };
    //sorting 
    for (int i = 0; i < arr.length; i++) {
      int curr = arr[i], prevPos = i - 1;
      while (prevPos >= 0 && arr[prevPos] > curr) {
        // swap to fit at right position
        arr[prevPos + 1] = arr[prevPos];
        prevPos--;
      }
      arr[prevPos+1] = curr;
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


