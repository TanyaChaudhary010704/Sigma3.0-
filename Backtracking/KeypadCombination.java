public class KeypadCombination {
  final static char[][] map = 
    {
      {},{},{'a','b','c'},{'d','e','f'},
      {'g','h','i'},{'j','k','l'},{'m','n','o'},
      {'p','q','r','s'},{'t','u','v'},
      {'w','x','y','z'}
    };
  public static void main(String[] args) {
    
    combinations("23");
  }

  public static void combinations(String digit) {
    int len = digit.length();
    if (len == 0) {
      System.out.println("");
      return;
    }
    bfs(0, len, new StringBuilder(), digit);
  }

  public static void bfs(int pos, int len, StringBuilder sb, String digit) {
    if (pos == len) {
      System.out.println(sb.toString());
      return;
    }
    else {
      int currDigit = digit.charAt(pos) - '0';
      char[] letters = map[currDigit];
      for (int i = 0; i < letters.length; i++) {
        bfs(pos + 1, len, sb.append(letters[i]), digit);
        sb.delete(sb.length() - 1, sb.length());
      }
    }
  }
}
