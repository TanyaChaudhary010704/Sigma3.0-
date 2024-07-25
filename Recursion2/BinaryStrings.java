public class BinaryStrings {
  public static void main(String[] args) {
    noConsecutiveOnes(3,0,"");
  }

  public static void noConsecutiveOnes(int n,int lastPlace , String str) {
    if (n == 0) {
      System.out.println(str);
      return;
    }
    noConsecutiveOnes(n - 1, 0, str+"0");
    if (lastPlace == 0) {
      noConsecutiveOnes(n - 1, 1, str+"1");
    }
    
  }
}
