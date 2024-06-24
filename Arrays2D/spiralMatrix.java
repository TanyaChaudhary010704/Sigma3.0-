package Arrays2D;

public class spiralMatrix {
  public static void SpiralMatrix(int[][] arr,int n){
    int startRow =0 , startCol =0 , endRow =n-1,endCol =n-1;
    while(startRow<=endRow && startCol<=endCol){
      //left to right
      for(int j=startCol;j<=endCol;j++){
        System.out.print(arr[startRow][j] + " ");
      }
      //top to bottom
      for(int i=startRow+1;i<=endRow;i++){
        System.out.print(arr[i][endCol] + " ");
      }
      //right to left
      for(int j=endCol-1;j>=startCol;j--){
        System.out.print(arr[endRow][j] + " ");
        if(startRow==endRow){
          break;
        }      }
      //bottom to top
      for(int i=endRow-1;i>=startRow+1;i--){
        System.out.print(arr[i][startCol] + " ");
        if(startCol==endCol){
          break;
        }
      }
      startRow++;
      endRow--;
      startCol++;
      endCol--;
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    int input[][] = {
      {1,2,3},
      {4,5,6},
      {7,8,9},};
    
   SpiralMatrix(input,3);   
  }
}
