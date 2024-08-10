public class KnightsTour {

  public static void main(String[] args) {
    int n=8;
    int board[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = -1;
      }
    }
    int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    board[0][0] = 0;
    if (!moves(board, 0, 0, xMove, yMove,1)) {
      System.out.println("Solutin does not exist");
    }
    else {
      printBoard(board);
    }
    
  }
  
  public static boolean moves(int[][] board, int i,int j,int[] xMove,int[] yMove,int step) {
    //base
    int n = board.length;
    int k,x,y;
    if (step == n*n) {
      return true;
    }
    for (k = 0; k < 8; k++) {
      x = i+xMove[k];
      y = j + yMove[k];
      if (isSafe(board, x, y)) {
        board[x][y] = step;
        if (moves(board, x, y, xMove, yMove, step + 1)) {
          return true;
        }
        else {
          board[x][y] = -1;
        }
      }

    }
    return false;
  }

  public static boolean isSafe(int[][] board, int row,int col) {
    //up
    int N = board.length;
    if (row >= 0 && row < N && col >= 0 && col < N && board[row][col] == -1) {
      return true;
    }
    return false;
  }

  public static void printBoard(int[][] board) {
    System.out.println("------------------------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
}

