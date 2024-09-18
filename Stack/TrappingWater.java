import java.util.Stack;
public class TrappingWater {
  public static int trap(int[] height) {

    Stack<Integer> stack = new Stack<>();
    int ans = 0;

    for (int r = 0; r < height.length; r++) {

      while (stack.size() > 0 && height[stack.peek()] < height[r]) {
        int m = stack.pop();
        if (stack.isEmpty()) {
          break;
        }
        int l = stack.peek();
        int h = Math.min(height[r], height[l]) - height[m];
        int w = r - l -1;
        ans += h * w;
      }
      stack.push(r);
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] height = {4,2,3,4};
    System.out.println(trap(height));
  }
}
