public class FriendsPairingProblem {
  public static void main(String[] args) {
    System.out.println(pair(5));
  }

  public static int pair(int n) {
    if (n == 1 || n ==2)
      return n;
    return pair(n - 1) + n-1*pair(n - 2);
  }
}
