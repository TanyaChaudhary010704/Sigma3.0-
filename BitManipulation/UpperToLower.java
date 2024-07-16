package BitManipulation;
//Upper case to lower case using bit manipulations
public class UpperToLower {
  public static void main(String[] args) {
    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print((char)(ch|' '));
    }
  }
}
