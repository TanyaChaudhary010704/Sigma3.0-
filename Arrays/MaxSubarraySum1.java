package Arrays;
public class MaxSubarraySum1 {
  public static void main(String[] args) {
    int[] array = { 1,-2,3,-4,5 };
    int sum = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      sum = 0;
      for (int j = i; j < array.length; j++) {
        sum += array[j];
        //System.out.println(sum);
        max = Math.max(max, sum);
      }
    }
    System.out.println("Max Sum : "+max);
  }
}
