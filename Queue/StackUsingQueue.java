package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue {
  static class Stack {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public boolean isEmpty() {
      return q1.isEmpty() && q2.isEmpty();
    }

    public void push(int val) {
      if (!q1.isEmpty()) {
        q1.add(val);
      } else {
        q2.add(val);
      }
    }

    public int pop() {
      if (isEmpty()) {
        System.out.println("stack is empty");
        return -1;
      }
      int top = -1;
      if (!q1.isEmpty()) {
        while (!q1.isEmpty()) {
          top = q1.remove();
          if (q1.isEmpty()) {
            break;
          }
          q2.add(top);
        }
      } else {
        while (!q2.isEmpty()) {
          top = q2.remove();
          if (q2.isEmpty()) {
            break;
          }
          q1.add(top);
        }
      }
      return top;
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("stack is empty");
        return -1;
      }
      int top = -1;
      if (!q1.isEmpty()) {
        while (!q1.isEmpty()) {
          top = q1.remove();
          q2.add(top);
        }
      } else {
        while (!q2.isEmpty()) {
          top = q2.remove();
          q1.add(top);
        }
      }
      return top;
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