package BinaryTree;

public class BTfunctions {
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
  
  static class Info {
    int d;
    int h;

    public Info(int d, int h) {
      this.d = d;
      this.h = h;
    }
  }

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh, rh) + 1;
  }
  
  public static int countNodes(Node root) {
    if (root == null) {
      return 0;
    }
    int lc = countNodes(root.left);
    int rc = countNodes(root.right);
    return lc + rc + 1;
  }
  
  public static int diameter(Node root) {
    if (root == null) {
      return 0;
    }
    int ld = diameter(root.left);
    int rd = diameter(root.right);
    int lh = height(root.left);
    int rh = height(root.right);
    int selfd = lh + rh + 1;
    return Math.max((ld > rd ? ld : rd), selfd);
  }
  
  public static Info diameter2(Node root) {
    if (root == null) {
      return new Info(0,0);
    }
    Info leftInfo = diameter2(root.left);
    Info rightInfo = diameter2(root.right);
    int d = Math.max(Math.max(leftInfo.d, rightInfo.d), leftInfo.h + rightInfo.h + 1);
    int h = Math.max(leftInfo.h, rightInfo.h) + 1;
    return new Info(d, h);
  }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    System.out.println(height(root));
    System.out.println(countNodes(root));
    System.out.println(diameter2(root).d);
  }
}

