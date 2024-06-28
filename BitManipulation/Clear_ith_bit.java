package BitManipulation;

public class Clear_ith_bit {
  public static void main(String[] args) {
    int n = 5,i =2;//101
    System.out.println(clearIthBit(n, i));
  }

  public static int clearIthBit(int n,int i) {
    int bitMask = ~(1<<i);
    return n & bitMask;
  }
}
