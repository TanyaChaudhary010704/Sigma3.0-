public class NumberToString {
  public static void main(String[] args) {
    printString(1947, "");
  }

  public static void printString(int num, String s) {
    if (num == 0) {
      System.out.println(s);
      return;
    }
    switch (num % 10) {
      case 0:
        s = "zero " + s;
        break;
      case 1:
        s = "one " + s;
        break;
      case 2:
        s = "two " + s;
        break;
      case 3:
        s = "three " + s;
        break;
      case 4:
        s = "four " + s;
        break;
      case 5:
        s = "five " + s;
        break;
      case 6:
        s = "six " + s;
        break;
      case 7:
        s = "seven " + s;
        break;
      case 8:
        s = "eight " + s;
        break;
      case 9:
        s = "nine " + s;
        break;
      default:
        System.out.println("Invalid");
        break;
    }
    printString(num/10, s);
  }
}
