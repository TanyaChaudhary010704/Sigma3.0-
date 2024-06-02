package Pattern;

public class floydTri {
  public static void main(String[] args) {
    int n = 5;
    int number = 1;
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        if(col<=row)
        System.out.print(number++ +" ");
      }
      System.out.println();
    }
  }
}
