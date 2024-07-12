package Arrays;
import java.util.*;
public class LonelyNumbers {
  public static void main(String[] args) {
    int[] nums = { 10, 6, 5, 8 };
    System.out.println(lonelyNums(nums));
  }

  public static ArrayList<Integer> lonelyNums(int[] nums) {
    int n = nums.length;
    ArrayList<Integer> ans = new ArrayList<Integer>();
    //from left to right
    for (int i = 0; i < nums.length; i++) {
      if (i < n - 1 && (nums[i + 1] == nums[i] - 1 || nums[i + 1] == nums[i] + 1)) {
        continue;
      } else if (i > 0 && (nums[i - 1] == nums[i] - 1 || nums[i - 1] == nums[i] + 1)) {
        continue;
      } else {
        ans.add(nums[i]);
      }
    }
    return ans;
  }
}
