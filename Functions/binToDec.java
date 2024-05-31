package Functions;
public class binToDec {
  public static void main(String[] args) {
    //input number
    int binary = 10;
    //make a copy of the original binary number
    int copy = binary;
    //powe of 2 -> 0,1,2,3....
    int power = 0;
    //decimal number to be converted in
    int decimal = 0;
    //loop will run until all the digits of the binary number are covered
    // 101 , 10 , 1 , 0
    while (binary > 0) {
      //getting last digit of binary 101->1 , 10->0 , 1->1
      int lastDigit = binary % 10;
      // 1*2^0 + 0*2^1 + 1*2^2
      decimal += lastDigit * (int) Math.pow(2, power);
      //incrementing power
      power++;
      //101 -> 10 -> 1-> 0
      binary /= 10;
    }
    System.out.println("Binary : "+copy+"\nDecimal : "+decimal);
  }
}