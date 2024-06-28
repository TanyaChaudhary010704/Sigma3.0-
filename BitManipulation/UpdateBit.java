package BitManipulation;

public class UpdateBit {
  public static void main(String[] args) {
    int n = 5 , i =1 , newBit = 1;//101
    System.out.println(updateBit(n, i, newBit));
    System.out.println(updateBit2(n, i, newBit));
  }

  public static int updateBit(int n, int i,int newBit) {
    if (newBit == 0) {
      return clearIthBit(n, i);
    }
    return setIthBit(n, i);
  }

  public static int updateBit2(int n, int i,int newBit) {
    n = clearIthBit(n, i);
    int bitMask = newBit << i;
    return n | bitMask;
  }

  public static int clearIthBit(int n, int i) {
    int bitMask = ~(1 << i);
    return n & bitMask;
  }
  
  public static int setIthBit(int n,int i) {
    int bitMask = 1<<i;
    return n | bitMask;
  }
}
