import java.util.Stack;

public class ValidParenthesis {
  public static boolean isValidPar(String s1) {

    Stack<Character> stack = new Stack<>();

    for (char c : s1.toCharArray()) {
      // opening braces >> push
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      }
      // closing braces >>
      else {
        if (stack.isEmpty()) {
          return false;
        }
        if ((c == ')' && stack.peek() == '(') ||
            (c == ']' && stack.peek() == '[') ||
            (c == '}' && stack.peek() == '{')) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    // if elements are remaining in stack
    if (!stack.isEmpty()) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String s1 = "(({[]}())";// false
    String s2 = "(({[]}))";// true
    String s3 = "){}[]";// true

    System.out.println(isValidPar(s1));
    System.out.println(isValidPar(s2));
    System.out.println(isValidPar(s3));
  }
}
