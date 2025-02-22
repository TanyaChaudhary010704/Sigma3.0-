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
    if (root == null)
      return false;
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

  public static int kthAncestor(Node root, int n, int k) {
    if (root == null) {
      return -1;
    }
    if (root.data == n) {
      return 0;
    }
    int leftDis = kthAncestor(root.left, n, k);
    int rightDis = kthAncestor(root.right, n, k);
    if (leftDis == -1 && rightDis == -1) {
      return -1;
    }
    int max = Math.max(leftDis, rightDis);
    if (max + 1 == k) {
      System.out.println(root.data);
    }
    return max + 1;
  }

  public static int lcaDis(Node root, int n) {
    if (root == null) {
      return -1;
    }
    if (root.data == n) {
      return 0;
    }
    int leftDis = lcaDis(root.left, n);
    int rightDis = lcaDis(root.right, n);
    if (leftDis == -1 && rightDis == -1) {
      return -1;
    } else if (leftDis == -1) {
      return rightDis + 1;
    } else {
      return leftDis + 1;
    }
  }

  public static int minDistance(Node root, int n1, int n2) {
    Node lca = lca2(root, n1, n2);
    int dis1 = lcaDis(lca, n1);
    int dis2 = lcaDis(lca, n2);
    return dis1 + dis2;
  }

  public static int sumTree(Node root) {
    if (root == null) {
      return 0;
    }
    int leftSum = sumTree(root.left);
    int rightSum = sumTree(root.right);
    int data = root.data;
    int newLeft = root.left == null ? 0 : root.left.data;
    int newRight = root.right == null ? 0 : root.right.data;
    root.data = leftSum + rightSum + newLeft + newRight;
    return data;
  }
  
  public static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
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
    // System.out.println(lca(root, n1, n2).data);
    // System.out.println(lca2(root, n1, n2).data);
    // System.out.println(minDistance(root, n1, n2));
    // kthAncestor(root, 7, 1);
    System.out.println(sumTree(root));
    preorder(root);
  }
}
