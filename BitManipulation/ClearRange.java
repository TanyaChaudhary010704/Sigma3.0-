package BitManipulation;

public class ClearRange {
  public static void main(String[] args) {
    int n = 15 , i =1,j=2;//1111
    System.out.println(clearRange(n, i,j));
  }

  public static int clearRange(int n, int i,int j) {
    int a = -1 << j + 1;
    int b = (1 << i) - 1;
    int bitMask = a | b;
    return (n & bitMask);
  }
}
