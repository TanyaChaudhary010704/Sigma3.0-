package Arrays2D;

public class diagonalSum {
  public static int DiagonalSum(int[][] arr, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i][i];
      if (i != n - 1 - i) {
        sum += arr[i][n - i - 1];
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    int input[][] = {
      {1,2,3},
      {4,5,6},
      {7,8,9},};
    System.out.println(DiagonalSum(input,3));
      
  }
}
