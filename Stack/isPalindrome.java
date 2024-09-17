import java.util.*;
public class isPalindrome {

  public static class Node {
    int data;
    Node next;

    public Node(int d) {
      this.next = null;
      this.data = d;
    }
  }
  public static boolean Palindrome(Node head) {
    Node temp = head;
    boolean isPalin = false;
    Stack<Integer> stack = new Stack<>();

    while (temp != null) {
      stack.push(temp.data);
      temp = temp.next;
    }

    while (head != null) {
      int i = stack.pop();
      if (head.data == i) {
        isPalin = true;
      } else {
        isPalin = false;
        break;
      }
      head = head.next;
    }
    return isPalin;
  }
  public static void main(String[] args) {
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);
    Node four = new Node(4);
    Node five = new Node(3);
    Node six = new Node(2);
    Node seven = new Node(1);
    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;
    five.next = six;
    six.next = seven;
    boolean result = Palindrome(one);
    System.out.println( "Palindrome:"+result);

  }
}
