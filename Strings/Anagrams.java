package Strings;
import java.util.Arrays;
public class Anagrams {
  public static void main(String[] args) {
    String str1 = "race";
    String str2 = "care";
    System.out.println(isAnagram(str1.toLowerCase(),str2.toLowerCase()));
  }

  public static boolean isAnagram(String str1, String str2) {
    char[] charr1= str1.toCharArray();
    char[] charr2 = str2.toCharArray();
    Arrays.sort(charr1);
    Arrays.sort(charr2);
    return Arrays.equals(charr1, charr2);
  }
}
