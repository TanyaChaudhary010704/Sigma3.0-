import java.util.Stack;

public class NextGreaterEle {

  public static int[] nextGreaterRight(int[] arr) {
    Stack<Integer> s = new Stack<>();
    int[] ng = new int[arr.length];

    for (int i = arr.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        ng[i] = -1;
      } else {
        ng[i] = arr[s.peek()];
      }
      s.push(i);
    }

    return ng;
  }
  
  public static int[] nextSmallerRight(int[] arr) {
    Stack<Integer> s = new Stack<>();
    int[] ng = new int[arr.length];

    for(int i=arr.length-1; i>=0; i--){
      while (!s.isEmpty() && arr[s.peek()] >arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        ng[i] = -1;
      }
      else {
        ng[i] = arr[s.peek()];
      }
      s.push(i);
    }
    
    return ng;
  }

  public static int[] nextSmallerLeft(int[] arr) {
    Stack<Integer> s = new Stack<>();
    int[] ng = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        ng[i] = -1;
      } else {
        ng[i] = arr[s.peek()];
      }
      s.push(i);
    }

    return ng;
  }
  
  public static int[] nextGreaterLeft(int[] arr) {
    Stack<Integer> s = new Stack<>();
    int[] ng = new int[arr.length];

    for (int i = 0; i <arr.length; i++) {
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        ng[i] = -1;
      } else {
        ng[i] = arr[s.peek()];
      }
      s.push(i);
    }

    return ng;
  }
  
  public static void print(int[] arr) {
    for (int element : arr) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = { 6, 8, 0, 1, 3 };
    print(arr);

    int[] ngr = nextGreaterRight(arr);
    System.out.println("Next Greater At Right");
    print(ngr);

    int[] ngl = nextGreaterLeft(arr);
    System.out.println("Next Greater At Left");
    print(ngl);

    int[] nsr = nextSmallerRight(arr);
    System.out.println("Next Smaller At Right");
    print(nsr);

    int[] nsl = nextSmallerLeft(arr);
    System.out.println("Next Smaller At Left");
    print(nsl);
  }
}
