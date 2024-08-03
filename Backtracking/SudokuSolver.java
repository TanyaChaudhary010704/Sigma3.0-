public class SudokuSolver {
  public static void main(String[] args) {
    int[][] sudoku = 
        {
      {0,0,8 , 0,0,0 , 0,0,0},
      {4,9,0 , 1,5,7 , 0,0,2},
      {0,0,3 , 0,0,4 , 1,9,0},
      
      {1,8,5 , 0,6,0 , 0,2,0},
      {0,0,0 , 0,2,0 , 0,6,0},
      {9,6,0 , 4,0,5 , 3,0,0},
      
      {0,3,0 , 0,7,2 , 0,0,4},
      {0,4,9 , 0,3,0 , 0,5,7},
      {8,2,7 , 0,0,9 , 0,1,3},
        };
    if (solver(sudoku, 0, 0)) {
      System.out.println("Solution exists");
      printSudoku(sudoku);
    }
    else {
      System.out.println("Solution does not exist");
    }
  }

  public static boolean solver(int[][] sudoku, int row, int col) {
    //base
    if (row == 8 && col == 8) {
      return true;
    } else if (row == 9) {
      return false;
    }
    //recursion
    int nextrow = row, nextcol = col + 1;
    if (col + 1 == 9) {
      nextrow = row + 1;
      nextcol = 0;
    }
    if (sudoku[row][col] != 0) {
      return solver(sudoku, nextrow, nextcol);
    }
    for (int digit = 1; digit <= 9; digit++) {
      if (isSafe(sudoku, row, col, digit)) {
        sudoku[row][col] = digit;//placing digits
        if (solver(sudoku, nextrow, nextcol)) {
          return true;//solutin possible
        }
        sudoku[row][col] = 0;//backtrack
      }
    }
    return false;
  }

  public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
    //col
    for (int i = 0; i < 9; i++) {
      if (sudoku[i][col] == digit) {
        return false;
      }
    }
    //row
    for (int i = 0; i < 9; i++) {
      if (sudoku[row][i] == digit) {
        return false;
      }
    }
    //grid
    int sr = (row / 3) * 3;//start row of grid
    int sc = (col / 3) * 3;//start column of grid
    for (int i = sr; i < sr + 3; i++) {
      for (int j = sc; j < sc + 3; j++) {
        if (sudoku[i][j] == digit) {
          return false;
        }
      }
    }
    return true;
  }

  public static void printSudoku(int[][] sudoku) {
    for (int i = 0; i < 9; i++) {
      if (i % 3 == 0) {
        System.out.println("------------------------");
      }
      for (int j = 0; j < 9; j++) {
        if (j % 3 == 0) {
          System.out.print("| ");
        }
        System.out.print(sudoku[i][j] + " ");
        if (j == 8) {
          System.out.print("| ");
        }
      }
      System.out.println();
      if (i ==8) {
        System.out.println("------------------------");
      }
    }
  }
}
