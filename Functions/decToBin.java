package Functions;

public class decToBin {
  public static void main(String[] args) {
    //input number
    int decimal = 5;
    //make a copy of the original decimal number
    int copy = decimal;
    //powe of 10 -> 0,1,2,3....
    int power = 0;
    //decimal number to be converted in binary
    int binary = 0;
    //loop will run until the number becomes zero
    // 5 , 2, 1, 0
    while (decimal > 0) {
      //getting last digit of binary 5->1 2->0 1->1 0 
      int remainder = decimal % 2;
      
      binary += remainder * (int) Math.pow(10, power);
      //incrementing power
      power++;
      //5 ->2 ->1 ->0
      decimal /= 2;
    }
    System.out.println("Decimal : "+copy+"\nBinary : "+binary);
  }
}
