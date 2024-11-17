package Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReversingKElements {
  public static void main(String[] args) {
    int k = 5;
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
    q.add(60);
    q.add(70);
    q.add(80);
    q.add(90);
    q.add(100);
    q = reversingKele(k, q);
    System.out.println(q);
  }

  public static Queue<Integer> reversingKele(int k, Queue<Integer> q) {
    
    int l = q.size();
    Stack<Integer> s = new Stack<>();
    for (int i = 0; i < k; i++) {
      s.push(q.remove());
    }
    while (!s.isEmpty()) {
      q.add(s.pop());
    }
    int i = l - k;
    while (i < l) {
      q.add(q.remove());
      i++;
    }
    return q;
  }
}
