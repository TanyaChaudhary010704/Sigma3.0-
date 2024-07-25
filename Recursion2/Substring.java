public class Substring {
  public static void main(String[] args) {
    String s = "abcab";
    int n = s.length();
    System.out.println(countSubstring(s, 0, n-1,n));
  }

  public static int countSubstring(String s, int start, int end, int length) {
    if (length == 1) {
      return 1;
    }
    if (length <= 0) {
      return 0;
    }
    int res = 
    countSubstring(s, start + 1, end, length - 1)
    + countSubstring(s, start, end-1, length-1)
    - countSubstring(s, start+1, end-1, length-2);
    if (s.charAt(start) == s.charAt(end)) {
      res++;
    }
    return res;
  }
}
