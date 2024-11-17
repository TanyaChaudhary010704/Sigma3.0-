package Queue;

import java.util.*;

public class MaxSubarray {
  public static void main(String[] args) {
    int arr[] = { 1, 5, 7, 3, 4, 2, 1, 6, 8 };
    maxOfSubarray(arr, 9, 3);
  }

  public static void maxOfSubarray(int[] array, int n, int k) {
    Deque<Integer> q = new LinkedList<>();
    for (int i = 0; i < k; i++) {
      //remove the prev smaller elements form queue
      while (!q.isEmpty() && array[i] >= array[q.peekLast()]) {
        q.removeLast();
      }
      //add new element at the rear end
      q.addLast(i);
    }
    //max of first window
    //process rest of the elements
    for (int i = k; i < n; i++) {
      System.out.println(array[q.peek()] + " ");

      //remove elements which are out of window
      while ((!q.isEmpty()) && q.peek() <= i - k) {
        q.removeFirst();
      }
      //remove elements which are smaller than the currently added element
      while ((!q.isEmpty()) && array[i] >= array[q.peekLast()]) {
        q.removeLast();
      }
      q.addLast(i);
    }
    System.out.println(array[q.peek()] + " ");
    
  }
}
