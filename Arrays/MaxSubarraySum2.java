package Arrays;
//prefix sum approach
// prefix[end]-prefix[start-1];
public class MaxSubarraySum2 {
  public static void main(String[] args) {
    int[] array = { 1, -2, 3, -4, 5 };

    int[] prefix = new int[array.length];
    prefix[0] =array[0];
    for (int i = 1; i < array.length; i++) {
      prefix[i] = prefix[i - 1] + array[i];
    }
    
    int sum = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      sum = 0;
      for (int j = i; j < array.length; j++) {
        sum =i==0? prefix[j] : prefix[j]-prefix[i-1];
        //System.out.println(sum);
        max = Math.max(max, sum);
      }
    }
    System.out.println("Max Sum : "+max);
  }
}
