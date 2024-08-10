
import java.util.ArrayList;
public class ContainerWithMostWater {

  public static void main(String[] args) {
    //int nums[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(8);
    nums.add(6);
    nums.add(2);
    nums.add(5);
    nums.add(4);
    nums.add(8);
    nums.add(3);
    nums.add(7);
    System.out.println(maxArea(nums));
  }

  public static int maxArea(ArrayList<Integer> height) {
    int max = 0;
    int left = 0;
    int right = height.size() - 1;
    while (left <= right) {
      int area = 0;
      int b = Math.abs(left - right);
      int l = Math.min(height.get(left), height.get(right));
      area = l * b;
      max = Math.max(area, max);
      if (height.get(left) < height.get(right)) {
        left++;
      }
      else {
        right--;
      }
    }
    return max;
  }
}

