public class RotatedArraySearch {
  public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
    int idx = search(arr, 0, arr.length - 1,0);
    System.out.println(idx);
  }

  public static int search(int[] arr, int s, int e, int target) {
    if(s>e) return -1;
    int mid = s + (e - s) / 2;
    //Found
    if (arr[mid] == target)
      return mid;
    //mid on first part 
    if (arr[s] <= arr[mid]) {
      //left search
      if (arr[s] <= target && target <= arr[mid]) {
        return search(arr, s, mid, target);
      }
      //right search
      else {
        return search(arr, mid + 1, e, target);
      }
    }
    //mid on second part
    else {
      //right search
      if (arr[mid] <= target && target <= arr[e]) {
        return search(arr, mid + 1, e, target);
      }
      else {
        return search(arr, s, mid-1, target);
      }
    }
  }
}
