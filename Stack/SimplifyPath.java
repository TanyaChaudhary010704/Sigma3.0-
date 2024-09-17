import java.util.Stack;

public class SimplifyPath {
  public static String simplify(String A) {
    Stack<String> stack = new Stack<String>();
    String res = "";
    res += "/";
    int len = A.length();
    for (int i = 0; i < len; i++) {
      String dir = "";
      while (i < len && A.charAt(i) == '/') {
        i++;
      }
      while (i < len && A.charAt(i) != '/') {
        dir += A.charAt(i);
        i++;
      }

      if (dir.equals("..")) {
        if (!stack.isEmpty()) {
          stack.pop();
        }
      } else if (dir.equals("."))
        continue;
      else if (dir.length() != 0) {
        stack.push(dir);
      }
    }
    Stack<String> st1 = new Stack<String>();
    while (!stack.isEmpty()) {
      st1.push(stack.pop());
    }
    while (!st1.isEmpty()) {
      if (st1.size() != 1) {
        res += (st1.pop() + "/");
      } else {
        res += st1.pop();
      }
    }
    return res;
  }

  public static void main(String[] args) {
    String str = new String("/a/./b/../../c/");
    String res = simplify(str);
    System.out.println(res);
  }
}
