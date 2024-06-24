package Strings;
//aaaa  a4
//time complexity O(n)
public class StringCompression {
  public static void main(String[] args) {
    String str = "aaaabbbbccd";
    System.out.println(compress(str));
  }

  public static String compress(String str) {
    String result = "";
    for (int i = 1; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      result += str.charAt(i);
      if(count> 1){
        result += count.toString();
      } 
    }
    return result;
  }
}
