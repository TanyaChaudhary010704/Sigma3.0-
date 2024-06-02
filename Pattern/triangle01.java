package Pattern;

public class triangle01 {
  public static void main(String[] args) {
    int n = 5;
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        if (row >= col) {
          if ((col + row) % 2 == 0) {
            System.out.print("1");
          } else {
            System.out.print("0");
          } 
        }
      }
      System.out.println();
    }
  }
}
