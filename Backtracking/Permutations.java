public class Permutations {
  public static void main(String[] args) {
    String s = "abc";
    //permutations= n!
    findPermutations(s,"");
  
  }

  public static void findPermutations(String s, String p){
    if (s.length()==0) {
      System.out.println(p);
      return;
    }
    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      String newS = s.substring(0, i) + s.substring(i + 1);
      findPermutations(newS, p+curr);
    }
  }
}
