package BitManipulation;

public class PowerOf2 {
  public static void main(String[] args) {
    int n = 4;//1111
    System.out.println(isPower(n));
  }

  public static boolean isPower(int n) {
    int bitMask = n-1;
    return (n & bitMask)==0;
  }
}
