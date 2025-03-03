package BinaryTree;

public class invertBT {
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

  public static void preorder(Node root) {
    if(root==null) return;
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
  }

  public static Node invert(Node root) {
    if (root == null)
      return null;
    if (root.left == null && root.right == null) {
      return root;
    }
    Node leftNode = invert(root.left);
    Node rightNode = invert(root.right);
    root.right = leftNode;
    root.left = rightNode;
    return root;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    System.out.println("original Tree");
    preorder(root);
    System.out.println();
    Node inverted = invert(root);
    System.out.println("inverted Tree");
    preorder(inverted);
  }
}

