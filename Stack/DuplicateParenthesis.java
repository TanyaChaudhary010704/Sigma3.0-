import java.util.Stack;

public class DuplicateParenthesis {
  public static boolean isDuplicatePar(String s1) {

    Stack<Character> stack = new Stack<>();

    for (char c : s1.toCharArray()) {
      // closing braces >>
      if (c == ')') {
        
        int count = 0;
        while (stack.peek() != '(') {
          //elements in between brackets
          count++;
          stack.pop();
        }

        if (count < 1) {
          return true;//duplicate
        } else {
          stack.pop();//remove opening braces
        }

      }else{
        stack.push(c);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String s1 = "((a+b))";// true
    String s2 = "((a+b)+(c+d))";// false

    System.out.println(isDuplicatePar(s1));
    System.out.println(isDuplicatePar(s2));

  }
}