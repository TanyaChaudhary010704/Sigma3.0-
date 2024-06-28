package BitManipulation;

public class FastExponentiation {
  public static void main(String[] args) {
    int a=3,n=5;//1111
    System.out.println(exponentiation(a,n));
  }

  public static int exponentiation(int a, int n) {
    int ans = 1;
    while (n > 0) {
      if ((n & 1) != 0) {
        ans = ans * a;
      }
      a = a * a;
      n = n >> 1;
    }
    return ans;
  }
}
