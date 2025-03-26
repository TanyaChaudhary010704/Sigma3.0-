package BinaryTree;

public class DeleteLeaf {
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
    if (root == null)
      return;
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  public static Node deleteLeaf(Node root, int x) {
    if (root == null) {
      return null;
    }
    root.left = deleteLeaf(root.left, x);
    root.right = deleteLeaf(root.right, x);
    if (root.data == x && root.left == null && root.right == null) {
      return null;
    }
    return root;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(3);
    root.right = new Node(3);
    root.left.left = new Node(3);
    root.left.right = new Node(2);
    System.out.println("original Tree");
    preorder(root);
    System.out.println();
    deleteLeaf(root,3);
    System.out.println("Updated Tree");
    preorder(root);
  }
}


