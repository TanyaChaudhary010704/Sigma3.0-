package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueue {
  public static void interleave(Queue<Integer> q1) {
    Queue<Integer> q2 = new LinkedList<Integer>();
    for (int i = 0; i <= (q1.size() / 2)+1; i++) {
      q2.add(q1.remove());
    }
    while (!q2.isEmpty()) {
      q1.add(q2.remove());
      q1.add(q1.remove());
    }

  }

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.add(6);
    queue.add(7);
    queue.add(8);
    interleave(queue);
    while (!queue.isEmpty()) {
      System.out.println(queue.peek());
      queue.remove();
    }
  }
}
