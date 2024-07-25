public class RemoveDuplicatesInString {
  public static void main(String[] args) {
    String s = "aaabcbdcd";
    StringBuilder sb = new StringBuilder();
    boolean[] map = new boolean[26];
    System.out.println(remove(s,sb,map,0));
  }

  public static String remove(String s,StringBuilder sb,boolean[] map,int idx) {
    if (idx == s.length()) {
      return sb.toString();
    }
    for (char c : s.toCharArray()) {
      if (map[c - 'a'] == true) {
      }
      else {
        map[c - 'a'] = true;
        sb.append(c);
      }
      
    }
    return remove(s, sb, map, idx + 1);
  }
}
