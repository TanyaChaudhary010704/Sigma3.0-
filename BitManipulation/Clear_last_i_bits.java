package BitManipulation;

public class Clear_last_i_bits {
  public static void main(String[] args) {
    int n = 15 , i =4;//1111
    System.out.println(clear_last_i_bits(n, i));
  }

  public static int clear_last_i_bits(int n, int i) {
    int bitMask = -1<<i;
    return (n & bitMask);
  }
}
