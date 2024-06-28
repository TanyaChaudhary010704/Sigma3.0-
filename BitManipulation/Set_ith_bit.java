package BitManipulation;

public class Set_ith_bit {
  public static void main(String[] args) {
    int n = 5,i =3;//101
    System.out.println(setIthBit(n, i));
  }

  public static int setIthBit(int n,int i) {
    int bitMask = 1<<i;
    return n | bitMask;
  }
}
