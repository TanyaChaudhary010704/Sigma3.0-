public class Occurances {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5, 6, 2, 7, 2, 2 };
    printOccurance(arr, 2,0);
  }

  public static void printOccurance(int[] arr, int key,int idx) {
    if (idx == arr.length) {
      return;
    }
    if (arr[idx] == key) {
      System.out.print(idx + " ");
    }
    printOccurance(arr, key, idx+1);
  }
}
