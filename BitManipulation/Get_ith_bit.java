package BitManipulation;

public class Get_ith_bit {
  public static void main(String[] args) {
    int n = 5,i =0;//101
    System.out.println(i +"th bit is : "+getIthBit(n, i));
  }

  public static int getIthBit(int n,int i) {
    int bitMask = 1<<i;
    if ((n & bitMask) == 0)
      return 0;
    return 1;
  }
}
