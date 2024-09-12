import java.util.Stack;

public class StockSpan {

  public static int[] stockSpan(int[] prices) {
    //to store index of previous high
    Stack<Integer> s = new Stack<>();
    //to store no of days for which price <= todays price (for each price) 
    int[] span = new int[prices.length];
    //initially
    span[0] = 1;
    s.push(0);
    for (int i = 0; i < prices.length; i++) {
      int price = prices[i];
      while (!s.isEmpty() && price > prices[s.peek()]) {
        s.pop();
      }
      if (s.isEmpty()) {
        span[i] = i + 1;
      }
      else {
        int prevhigh = s.peek();
        span[i] = i - prevhigh;
      }
      s.push(i);
    }
    return span;
  }

  public static void main(String[] args) {
    int[] prices = { 100, 80, 60, 70, 60, 85, 100 };
    int[] result = stockSpan(prices);
    for (int ele : result) {
      System.out.print(ele+",");
    }
  }
}