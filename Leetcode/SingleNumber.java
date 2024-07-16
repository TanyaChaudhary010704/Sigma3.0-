package Leetcode;

class SingleNumber {
  public static int singleNumber(int[] nums) {
    int xor = 0;
    for (int i = 0; i < nums.length; i++) {
      xor ^= nums[i];
    }
    return xor;
  }
  public static void main(String[] args) {
    int nums[] = { 10, 20, 20, 30, 10, 50, 50 };
    System.out.println(singleNumber(nums));
  }
}
