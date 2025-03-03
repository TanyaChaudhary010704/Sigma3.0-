package BinaryTree;
import java.util.HashMap;
public class checkIfUnivalued {
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
  static HashMap<Integer,Boolean> map = new HashMap<>();

  public static boolean isUnivalued(Node root) {
    if(root == null) return true;
    if (map.containsKey(root.data)) {
      return false;
    }
    map.put(root.data, true);
    return isUnivalued(root.left) && isUnivalued(root.right);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    System.out.println(isUnivalued(root));
  }
}
