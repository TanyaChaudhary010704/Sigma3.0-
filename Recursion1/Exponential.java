public class Exponential {
  //O(n)
  public static int exp(int x, int n) {
    if (n == 0) {
      return 1;
    }
    return x * exp(x, n - 1);
  }
  //O(logn)
  public static int exp2(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int halfpower = exp(x, n / 2);
    if (n % 2 == 0) {
      return halfpower*halfpower;
    }
    return x*halfpower*halfpower;
  }
  public static void main(String[] args) {
    System.out.println(exp(2, 5));
    System.out.println(exp2(2, 5));
  }
}
