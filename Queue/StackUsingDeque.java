package Queue;

import java.util.LinkedList;
import java.util.Deque;

public class StackUsingDeque {
  static class Stack {
    Deque<Integer> d = new LinkedList<Integer>();

    public boolean isEmpty() {
      return d.isEmpty() ;
    }

    public void push(int val) {
      d.addLast(val);
    }

    public int pop() {
      if (isEmpty()) {
        System.out.println("stack is empty");
        return -1;
      }
      return d.removeLast();
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("stack is empty");
        return -1;
      }
      return d.getLast();
    }
  }
  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}
