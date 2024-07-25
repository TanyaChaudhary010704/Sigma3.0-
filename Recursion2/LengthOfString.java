public class LengthOfString {
  public static void main(String[] args) {
    System.out.println(length("tanya chaudhary"));
  }

  public static int length(String s) {
    if (s.length()==0) {
      return 0;
    }

    return length(s.substring(1))+1;

  }
}
