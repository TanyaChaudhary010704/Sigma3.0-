package Leetcode;

public class MinBitFlips {
  public static int minBitFlips(int start, int goal) {
    int n = start ^ goal;//helps to recognize different bits to be flipped
    int count = 0;
    while (n != 0) {
      n &= n - 1;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int x = 10, y = 7;
    System.out.println(minBitFlips(x,y));
  }
}
