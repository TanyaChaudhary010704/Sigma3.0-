package Pattern;

public class diamond {
  public static void main(String[] args) {
    int n = 5;
    //1st half
    for (int row = 1; row <= n; row++) {
      //spaces
      for (int col = 1; col <= n - row; col++) {
        System.out.print(" ");
      }
      //stars
      for (int star = 1; star <= 2*row-1; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //1nd half
    for (int row = n; row >0; row--) {
      //spaces
      for (int col = 1; col <= n - row; col++) {
        System.out.print(" ");
      }
      //stars
      for (int star = 1; star <= 2*row-1; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
