package Pattern;

public class butterfly {
  public static void main(String[] args) {
    int n = 2;
    //1st half 
    for (int row = 1; row <= n; row++) {
      //stars
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      //spaces
      for (int col = 1; col <= 2*(n-row); col++) {
        System.out.print(" ");
      }
      //stars
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //2nd half 
    for (int row = n; row >0; row--) {
      //stars
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      //spaces
      for (int col = 1; col <= 2*(n-row); col++) {
        System.out.print(" ");
      }
      //stars
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
