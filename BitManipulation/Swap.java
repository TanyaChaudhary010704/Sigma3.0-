package BitManipulation;
//Swappping two numbers using Xor
public class Swap {
  public static void main(String[] args) {
    int x = 3, y = 4;
    System.out.println("Before swap " + x + "," + y);
    x = x ^ y;
    y = x ^ y;
    x = x ^ y;
    System.out.println("After swap " + x + ","+y);
  }
}
