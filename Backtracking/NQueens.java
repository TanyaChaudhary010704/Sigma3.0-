public class NQueens {
  //place n queens in each row such that no two queens attack each other
  static int count = 0;
  public static void main(String[] args) {
    int n=4;
    char board[][] = new char[n][n];
    for (int i=0; i<n; i++){
      for (int j=0; j<n; j++){
        board[i][j] = 'X';
      }
    }
    ways(board, 0);
    System.out.println(count);
  }

  public static void ways(char[][] board, int i) {
    //base
    if (i == board.length) {
      printBoard(board);
      count++;
      return;
    }
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, i, j)) {
        board[i][j] = 'Q';
        ways(board, i + 1);
        board[i][j] = 'X';//backtrack
      }
      
    }
  }

  public static boolean isSafe(char[][] board, int row,int col) {
    //vertically up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    //diagonally left up
    for (int i = row - 1,j=col-1; i >= 0 && j>=0; i--,j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    //diagonally right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  public static void printBoard(char[][] board) {
    System.out.println("------------------------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
}
