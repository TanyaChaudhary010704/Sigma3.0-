package Arrays;
public class BuySellStock {
  public static int buySellStock(int[] prices) {
    int bp = Integer.MAX_VALUE;
    int maxp = 0;
    for (int i = 0; i < prices.length; i++) {
      if (bp < prices[i]) {
        int p = prices[i] - bp;
        maxp = Math.max(maxp, p);
      } else {
        bp = prices[i];
      }
    }
    return maxp;
  }
  public static void main(String[] args) {
    int prices[] = { 7, 1, 5, 3, 6, 4 };
    System.out.println(buySellStock(prices));
  }
}
