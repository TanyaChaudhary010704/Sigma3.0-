package BinaryTree;
import java.util.ArrayList;
//Lowest common ancestor
public class LCA {
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
  
  public static boolean getPath(Node root, int node, ArrayList<Node> path) {
    if(root == null) return false;
    path.add(root);
    if (root.data == node) {
      return true;
    }
    boolean left = getPath(root.left, node, path);
    boolean right = getPath(root.right, node, path);
    if (left || right) {
      return true;
    }
    path.remove(path.size() - 1);
    return false;

  }

  public static Node lca(Node root, int n1, int n2) {
    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();
    getPath(root, n1, path1);
    getPath(root, n2, path2);
    int i = 0;
    for (; i < path1.size() && i < path2.size(); i++) {
      if (path1.get(i) != path2.get(i)) {
        break;
      }
    }
    return path1.get(i - 1);
  }

  public static Node lca2(Node root, int n1, int n2) {
    if (root == null || root.data == n1 || root.data == n2) {
      return root;
    }
    Node leftLCA = lca2(root.left, n1, n2);
    Node rightLCA = lca2(root.right, n1, n2);
    if (leftLCA == null) {
      return rightLCA;
    }
    if (rightLCA == null) {
      return leftLCA;
    }
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
    int n1 = 4, n2 = 5;
    System.out.println(lca(root, n1, n2).data);
    System.out.println(lca2(root, n1, n2).data);
  }
}
