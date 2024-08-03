public class GridWays {
  //source to destination
  public static void main(String[] args) {
    //int[][] grid = new int[4][5];
    System.out.println(gridways(0,0,3,3));
  }
  public static int gridways(int i, int j,int n,int m) {
    //base case
    if (i == n - 1 && j == m - 1) {
      return 1;
    }else if(i==n || j==m) {
      return 0; 
    }
    //right move
    int w1 = gridways(i, j + 1,n,m);
    //down move
    int w2 = gridways(i + 1, j, n, m);
    return w1+w2;
  }
}
