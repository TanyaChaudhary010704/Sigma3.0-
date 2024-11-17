package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class GenerateBinary {
  
  public static void main(String[] args) {
    int n = 5;
    generateBinary(n);
  }

  public static void generateBinary(int n) {
    Queue<String> q = new LinkedList<String>();
    q.add("1");
    while (n-- > 0) {
      String s1 = q.peek();
      q.remove();
      System.out.println(s1);
      String s2 = s1;
      q.add(s1 + "0");
      q.add(s2 + "1");
    }
  }
}
