import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class FindDuplicateSubtrees {
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
  
  static HashMap<String, Integer> m;
  public static String inorder(Node node) {
    if (node == null) {
      return "";
    }
    String str = "";
    str += inorder(node.left);
    str += Integer.toString(node.data);
    str += inorder(node.right);
    if (m.get(str) != null && m.get(str) == 1) {
      System.out.println(str);
    }
    if (m.containsKey(str)) {
      m.put(str, m.get(str) + 1);
    }
    else {
      m.put(str, 1);
    }
    return str;
  }
  public static void printDuplicates(Node root) {
    m = new HashMap<>();
    inorder(root);
  }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(4);
    root.right = new Node(3);
    root.left.left = new Node(3);
    root.right.left = new Node(4);
    root.right.right = new Node(3);
    root.right.left.left = new Node(3);
    printDuplicates(root);
  }
}
