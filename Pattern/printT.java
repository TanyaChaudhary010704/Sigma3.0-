package Pattern;

public class printT {
  public static void main(String[] args) {
    int n = 5;
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        if (row ==1)
          System.out.print("*");
        else if(col == 3)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
