package Arrays2D;
//print number of sevens
public class Ques1 {
  public static int findSevens(int[][] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == 7) {
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int[][] arr = {
        { 4, 7, 8 }, { 8, 8, 7 } };
    System.out.println(findSevens(arr));
  }
}
