package Arrays2D;
//transpose of a Matrix
public class Ques2 {

  public static void transpose(int[][] arr) {
    int n = arr.length;
    int m = arr[0].length;
    int transpose[][] = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        transpose[i][j] = arr[j][i];
      }
    }
    print(transpose);
  }

  public static void print(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
  }
  }
  public static void main(String[] args) {
    int[][] arr = {
        { 4, 7, 8 }, { 8, 8, 7 } };
    transpose(arr);
  }
}
