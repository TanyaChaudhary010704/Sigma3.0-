
//ways to tile up the board of 2*n size with  tiles of size 2*1
public class TilingProblem {
  public static void main(String[] args) {
    System.out.println(tilingWays(4));
  }

  public static int tilingWays(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    //fill vertical    
    return tilingWays(n-1)+tilingWays(n-2);
  }
}
