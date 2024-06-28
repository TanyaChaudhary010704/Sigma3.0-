package BitManipulation;
//check whether the number is odd or even
public class OddEven {
  public static void main(String[] args) {
    int n = 4;//101
    if (isEven(n)) {
      System.out.println("The number is even");
    }
    else {
      System.out.println("The number is odd");
    }
  }

  public static boolean isEven(int n) {
    int bitMask = 1;
    if ((n & bitMask) == 0)
      return true;
    return false;
  }
}
