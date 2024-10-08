import java.util.Stack;

public class ReverseStack {

  public static void pushAtBottom(Stack<Integer> s, int val) {
    if (s.empty()) {
      s.push(val);
      return;
    }
    int top = s.pop();
    pushAtBottom(s, val);
    s.push(top);
  }
  
  public static void reverseStack(Stack<Integer> s) {
    if (s.empty()) {
      return;
    }
    int top = s.pop();
    reverseStack(s);
    pushAtBottom(s, top);
  }
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<Integer>();
    s.push(1);
    s.push(2);
    s.push(3);
    reverseStack(s);
    while (!s.empty()) {
      System.out.println(s.pop());
    }
  }
}
