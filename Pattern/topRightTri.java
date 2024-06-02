package Pattern;

public class topRightTri {
  public static void main(String[] args) {
    int n = 5;
    for (int row = 1; row <= n; row++) {
      for (int space = 1; space < row; space++) {
        System.out.print(" ");
      }
      for (int col = row; col <= n; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // ---------OR---------------------
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        if (row <= col)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
