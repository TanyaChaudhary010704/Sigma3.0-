package Pattern;

public class rotatedHollowRhombus {
  public static void main(String[] args) {
    int n = 3;
    //1st half
    for (int i = 0; i < n; i++) {
      //spaces 
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      //first star
      System.out.print("*");
      //spaces
      for (int j = 0; j < 2 * i - 1; j++) {
        System.out.print(" ");
      }
      //2nd star
      if (i != 0) {
        System.out.print("*");
      }
      System.out.println();
    }
    //2nd half
    for (int i = n-2; i >=0; i--) {
      //spaces 
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      //first star
      System.out.print("*");
      //spaces
      for (int j = 0; j < 2 * i - 1; j++) {
        System.out.print(" ");
      }
      //2nd star
      if (i != 0) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
