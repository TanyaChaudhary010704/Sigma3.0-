public class FirstOccurance {
  public static int getFirstOccurance(int[] arr, int key, int i) {
    if (arr[i] == key) {
      return i;
    }
    if (i == arr.length) {
      return -1;
    }
    return getFirstOccurance(arr, key, i + 1);
  }

  public static int getLastOccurance(int[] arr, int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    int isFound = getLastOccurance(arr, key, i + 1);
    if (isFound == -1 && arr[i] == key) {
      return i;
    }
    return isFound;
  }
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5, 4, 5 };
    System.out.println(getFirstOccurance(arr, 5,0));
    System.out.println(getLastOccurance(arr, 5,0));
  }
}
