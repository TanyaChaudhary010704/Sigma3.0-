//kedans algorithm
public class MaxSubarraySum3 {
  public static void main(String[] args) {
    int[] array = { 1, -2, 3, -4, 5 };

    int cs = 0;
    int ms = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      cs = cs + array[i];
      if (cs < 0) {
        cs = 0;
      }
      ms = Math.max(cs, ms);
    }
    System.out.println("Max Sum : "+ms);
  }
}
