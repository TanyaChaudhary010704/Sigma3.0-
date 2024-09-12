import java.util.Stack;

public class ReverseString {
  public static String reverseString(String str) {
    Stack<Character> s = new Stack<>();
    for (char c : str.toCharArray()) {
      s.push(c);
    }
    StringBuilder reverse = new StringBuilder("");
    while (!s.isEmpty()) {
      char c = s.pop();
      reverse.append(c);
    }
    return reverse.toString();
  }
  public static void main(String[] args) {
    
    System.out.println(reverseString("tanya"));
    
  }
}
