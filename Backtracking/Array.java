
public class Array {
  public static void main(String[] args) {
    int arr[] = new int[5];
    changeArr(arr, 0, 1);
    System.out.println("Changed Array");
    printArr(arr);
  }

  public static void changeArr(int[] arr, int i, int val) {
    if (i == arr.length) {
      printArr(arr);
      return;
    }
    arr[i] = val;
    changeArr(arr, i + 1, val + 1);//function call
    arr[i] = arr[i] - 2;//backtracking step
  }

  public static void printArr(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " " );
    }
  }
}
