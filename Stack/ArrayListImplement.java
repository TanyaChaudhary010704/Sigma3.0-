import java.util.ArrayList;
public class ArrayListImplement {
  static class Stack {
    static ArrayList<Integer> list = new ArrayList<Integer>();

    public boolean isEmpty() {
      return list.size() == 0;
    }

    public void push(int data) {
      list.add(data);
    }

    public int pop() {
      if (list.size() == 0) {
        return -1;
      }
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    public int peek() {
      if (list.size() == 0) {
        return -1;
      }
      return list.get(list.size() - 1);
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
