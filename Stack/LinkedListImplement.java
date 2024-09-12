import java.util.ArrayList;
import java.util.Stack;

public class LinkedListImplement {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  

  static class Stack {
    public static Node head;

    public boolean isEmpty() {
      return head==null;
    }

    public void push(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    public int pop() {
      if (head == null) {
        return -1;
      }
      int top = head.data;
      head = head.next;
      return top;
    }

    public int peek() {
      if (head == null) {
        return -1;
      }
      return head.data;
    }

    public void print(Stack s) {
      while (!s.isEmpty()) {
        System.out.println(s.pop());
      }
    }

    public static void main(String[] args) {
      Stack s = new Stack();
      s.push(1);
      s.push(2);
      s.push(3);
      System.out.println(s.peek());
      s.print(s);
    }
  }
}
