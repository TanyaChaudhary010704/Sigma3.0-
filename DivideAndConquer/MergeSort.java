
public class MergeSort {
  public static void main(String[] args) {
    int arr[] = { 2, 5, 6, 3, 9, 8 };
    mergeSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    
  }

  public static void mergeSort(int[] arr, int s, int e) {
    if (s >= e) {
      return;
    }
    int mid = s + (e - s) / 2;
    mergeSort(arr, s, mid);
    mergeSort(arr, mid + 1, e);
    merge(arr, s, mid, e);
  }

  public static void merge(int[] arr, int s, int mid, int e) {
    int temp[] = new int[e - s + 1];
    int i = s;
    int j = mid + 1;
    int k = 0;//for temp array
    while (i <= mid && j <= e) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;

      } else {
        temp[k] = arr[j];
        j++;

      }
      k++;
    }
    //left part
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    //right part
    while (j <= e) {
      temp[k++] = arr[j++];
    }
    //copy to original array
    for (k = 0, i = s; k < temp.length; k++,i++) {
      arr[i] = temp[k];
    }
  }
}