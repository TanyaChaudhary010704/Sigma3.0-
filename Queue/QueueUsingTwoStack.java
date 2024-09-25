package Queue;
import java.util.Stack;
public class QueueUsingTwoStack {
  static class Queue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public void add(int val) {
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
      s1.push(val);
      while (!s2.isEmpty()) {
        s1.push(s2.pop());
      }
    }

    public int remove() {
      if (s1.isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
      }
      return s1.pop();
    }

    public int peek() {
      if (s1.isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
      }
      return s1.peek();
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
