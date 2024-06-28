package Strings;
//Count how many times lower case vowels occurred in a String entered by the user
public class findLower {
  public static void main(String[] args) {
    String str = "hi , I am tanya";
    System.out.println(findLowerVowelsCount(str));
  }

  public static int findLowerVowelsCount(String str) {
    int vowelsCount = 0;
    for (char ch : str.toCharArray()) {
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelsCount++;
      }
    }
    return vowelsCount;
  }
}
