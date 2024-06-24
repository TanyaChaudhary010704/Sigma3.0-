package Arrays2D;

public class staircaseSearch {
  public static int[] Search(int[][] arr, int n,int key) {
    int row = 0, col = n - 1;
    while (row < n && col >= 0) {
      if (arr[row][col] == key) {
        return new int[] { row+1, col +1};
      } else if (key < arr[row][col]) {
        col--;
      } else {
        row++;
      }
    }
    return new int[] { 0, 0 };
  }
  public static void main(String[] args) {
    int input[][] = {
      {1,2,3},
      {4,5,6},
      {7,8,9},};
    
    int arr[] = Search(input, 3, 8);
    System.out.print(arr[0]+",");
    System.out.println(arr[1]);
  }
}
