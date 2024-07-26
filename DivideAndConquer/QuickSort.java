public class QuickSort {
  public static void main(String[] args) {
    int arr[] = { 2, 5, 6, 3, 9, 8 };
    quickSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void quickSort(int[] arr, int s, int e) {
    if (s >= e) {
      return;
    }
    int pivotIdx = partition(arr, s, e);
    quickSort(arr, s, pivotIdx - 1);
    quickSort(arr, pivotIdx + 1, e);
  }

  public static int partition(int[] arr, int s, int e) {
    int pivot = arr[e];
    int i = s - 1;
    for (int j = s; j < e; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    i++;
    int temp = pivot;
    arr[e] = arr[i];
    arr[i] = temp;
    return i;
  }
}
