package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
  static class Queue {
    Deque<Integer> d = new LinkedList<>();

    public void add(int val) {
      d.addLast(val);
    }

    public int remove() {
      if (d.isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
      }
      return d.removeFirst();
    }

    public int peek() {
      if (d.isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
      }
      return d.getFirst();
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    for (int i = 0; i < 5; i++) {
      System.out.println(q.peek());
      q.remove();
    }
    
  }
}
