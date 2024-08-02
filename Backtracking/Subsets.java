public class Subsets {
  public static void main(String[] args) {
    String s = "abc";
    //2 pow n subsets
    findSubsets(s, "", 0);
  }

  public static void findSubsets(String s, String ans, int i) {
    //base case
    if (i == s.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      }
      System.out.println(ans);
      return;
    }
    //recursion
    //yes choice
    findSubsets(s, ans+s.charAt(i), i+1);
    
    //no choice
    findSubsets(s, ans, i+1);
  }
}
