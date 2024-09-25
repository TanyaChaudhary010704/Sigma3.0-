package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class FirstNonRepeatingLetter {

  public static void firstNonRepeatingLetter(String s) {
    int[] freq = new int[26];
    Queue<Character> q = new LinkedList<>();
    for (char c : s.toCharArray()) {
      q.add(c);
      freq[c - 'a']++;
      while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
        q.remove();
      }
      if (q.isEmpty()) {
        System.out.println(-1);
      }
      else {
        System.out.println(q.peek());
      }
    }
  }
  public static void main(String[] args) {
    String s = "aabccxb";
    firstNonRepeatingLetter(s);
  }
}
