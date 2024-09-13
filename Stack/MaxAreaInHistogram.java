import java.util.Stack;

public class MaxAreaInHistogram {

  public static int[] nextSmallerRight(int[] arr) {
    Stack<Integer> s = new Stack<>();
    int[] ng = new int[arr.length];

    for(int i=arr.length-1; i>=0; i--){
      while (!s.isEmpty() && arr[s.peek()] >=arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        ng[i] = arr.length;
      }
      else {
        ng[i] = s.peek();
      }
      s.push(i);
    }
    
    return ng;
  }

  public static int[] nextSmallerLeft(int[] arr) {
    Stack<Integer> s = new Stack<>();
    int[] ng = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        ng[i] = -1;
      } else {
        ng[i] = s.peek();
      }
      s.push(i);
    }

    return ng;
  }
  
  public static int maxArea(int[] heights) {
    int[] nsl = nextSmallerLeft(heights);
    int[] nsr = nextSmallerRight(heights);
    
    int maxArea = Integer.MIN_VALUE;
    for (int i = 0; i < heights.length; i++) {
      int area = heights[i] * (nsr[i] - nsl[i] - 1);
      maxArea = Math.max(maxArea, area);
    }
    return maxArea;
  }

  public static void main(String[] args) {
    int[] arr = { 2,1,5,6,2,3 };
    System.out.println(maxArea(arr));
  }
}
