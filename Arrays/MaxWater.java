package Arrays;
//find the area of the container trapping maximum water
public class MaxWater {
  public static void main(String[] args) {
    int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    //int ans = maxArea1(height);
    int ans = maxArea2(height);
    System.out.println(ans);
  }
  //brute force
  // tc = O(n2)
  public static int maxArea1(int[] height) {
    int max = 0;
    for (int i = 0; i < height.length; i++) {
      for (int j = i + 1; j < height.length; j++) {
        int b = Math.abs(j - i);
        int l = Math.min(height[i], height[j]);
        int area = l * b;
        max = Math.max(area, max);
      }
    }
    return max;
  }
  //optimized version 1 
  //two pointer approach
  //tc - O(n)
  public static int maxArea2(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;
    while (left <= right) {
      int area = 0;
      int b = Math.abs(left - right);
      int l = Math.min(height[left], height[right]);
      area = l * b;
      max = Math.max(area, max);
      if (height[left] < height[right]) {
        left++;
      }
      else {
        right--;
      }
    }
    return max;
  }
}
