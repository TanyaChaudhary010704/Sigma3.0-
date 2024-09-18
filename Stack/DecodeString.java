import java.util.*;

public class DecodeString {

  public static String decode(String str) {

    Stack<Integer> Istack = new Stack<>();
    Stack<Character> Strstack = new Stack<>();
    String temp = "", result = "";

    for (int i = 0; i < str.length(); i++) {

      //add number to stack of integers
      int count = 0;
      if (Character.isDigit(str.charAt(i))) {
        while (Character.isDigit(str.charAt(i))) {
          count = count * 10 + str.charAt(i) - '0';
          i++;
        }
        i--;
        Istack.push(count);
      }
      //when bracket closes
      else if (str.charAt(i) == ']') {
        temp = "";
        count = 0;
        //take count for current string
        if (!Istack.isEmpty()) {
          count = Istack.peek();
          Istack.pop();
        }
        //Store current string in temp until open braces are encountered
        while (!Strstack.isEmpty() && Strstack.peek() != '[') {
          temp = Strstack.peek() + temp;
          Strstack.pop();
        }
        //pop open braces at last
        if (!Strstack.isEmpty() && Strstack.peek() == '[') {
          Strstack.pop();
        }
        //repeat temp count times and store in result
        for (int j = 0; j < count; j++) {
          result = result + temp;
        }
        //push result elements in stack of Strings
        for (int j = 0; j < result.length(); j++) {
          Strstack.push(result.charAt(j));
        }
        //reset result
        result = "";
      }
      //when open braces are encountered
      else if (str.charAt(i) == '[') {
        //if string need to be repeated 
        if (Character.isDigit(str.charAt(i - 1))) {
          Strstack.push(str.charAt(i));
        } else {
          Strstack.push(str.charAt(i));
          Istack.push(1);
        }
      }
      //other than [ ,], digit
      else {
        Strstack.push(str.charAt(i));
      }
    }
    //remaining elements
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
