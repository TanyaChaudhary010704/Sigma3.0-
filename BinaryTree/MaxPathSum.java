public class MaxPathSum {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  
  public static int maxSumPath(Node root) {
    if (root == null) {
      return 0;
    }
    int ls = maxSumPath(root.left);
    int rs = maxSumPath(root.right);
    int maxSum = Math.max(ls, rs);
    maxSum = Math.max(ls + rs + root.data, maxSum);
    return maxSum;
  }
  public static void main(String[] args) {
    Node root = new Node(-10);
    root.left = new Node(9);
    root.right = new Node(20);
    root.right.left = new Node(15);
    root.right.right = new Node(7);
    int ans = maxSumPath(root);
    System.out.println(ans);
  }
}
