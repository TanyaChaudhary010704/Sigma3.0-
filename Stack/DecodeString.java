import java.util.*;

public class DecodeString {

  public static String decode(String str) {

    Stack<Integer> Istack = new Stack<>();
    Stack<Character> Strstack = new Stack<>();
    String temp = "", result = "";

    for (int i = 0; i < str.length(); i++) {

      int count = 0;
      if (Character.isDigit(str.charAt(i))) {
        while (Character.isDigit(str.charAt(i))) {
          count = count * 10 + str.charAt(i) - '0';
          i++;
        }
        i--;
        Istack.push(count);
      }

      else if (str.charAt(i) == ']') {
        temp = "";
        count = 0;
        if (!Istack.isEmpty()) {
          count = Istack.peek();
          Istack.pop();
        }
        while (!Strstack.isEmpty() && Strstack.peek() != '[') {
          temp = Strstack.peek() + temp;
          Strstack.pop();
        }
        if (!Strstack.isEmpty() && Strstack.peek() == '[') {
          Strstack.pop();
        }
        for (int j = 0; j < count; j++) {
          result = result + temp;
        }
        for (int j = 0; j < result.length(); j++) {
          Strstack.push(result.charAt(j));
        }
        result = "";
      } else if (str.charAt(i) == '[') {
        if (Character.isDigit(str.charAt(i - 1))) {
          Strstack.push(str.charAt(i));
        } else {
          Strstack.push(str.charAt(i));
          Istack.push(1);
        }
      } else {
        Strstack.push(str.charAt(i));
      }
    }
    while (!Strstack.isEmpty()) {
      result = Strstack.peek() + result;
      Strstack.pop();
    }
    return result;
  }
  
  public static void main(String[] args) {
    String str = "3[b2[ca]]";
    System.out.println(decode(str));
  }
}
