import java.util.ArrayList;
public class MostFrequentNumberFollowingKey {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(100);
    nums.add(200);
    nums.add(100);
    nums.add(1);
    nums.add(100);
    System.out.println(getMostFrequentNumber(nums, 1));
  }

  public static int getMostFrequentNumber(ArrayList<Integer> nums, int key) {
    int[] counts = new int[1000];

    for (int i = 0; i < nums.size() - 1; i++) {
      if (nums.get(i) == key) {
        counts[nums.get(i+1) - 1]++;
      }
    }
    int target = 0;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < 1000; i++) {
      
      if (counts[i] > max) {
        max = counts[i];
        target = i + 1;
      }
    }
    return target;
  }
}
