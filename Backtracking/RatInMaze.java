import java.util.ArrayList;
import java.util.List;
public class RatInMaze {
  //source to destination
  

  public static int gridways(int i, int j, int n, int m) {
    //base case
    if (i == n - 1 && j == m - 1) {
      return 1;
    } else if (i == n || j == m) {
      return 0;
    }
    //right move
    int w1 = gridways(i, j + 1, n, m);
    //down move
    int w2 = gridways(i + 1, j, n, m);
    return w1 + w2;
  }

  static List<String> result = new ArrayList<>();
  
  public static void paths(int[][] maze, int n, StringBuilder path, int i, int j) {
    //base case
    if (i == n || j == n || i<0 ||j<0 || maze[i][j]==0) {
      return;
    }
    if (i == n - 1 && j == n - 1) {
      result.add(path.toString());
      System.out.println(path.toString());
      return;
    }
     
    maze[i][j] = 0;
    paths(maze, n, path.append('D'), i + 1, j);
    path.delete(path.length() - 1, path.length());

    paths(maze, n, path.append('R'), i, j + 1);
    path.delete(path.length() - 1, path.length());

    paths(maze, n, path.append('U'), i - 1, j);
    path.delete(path.length() - 1, path.length());
    
    paths(maze, n, path.append('L'), i, j - 1);
    path.delete(path.length() - 1, path.length());
    maze[i][j] = 1;  
  }
  public static void main(String[] args) {
    int maze[][] = 
        { { 1, 0, 0, 0 },
          { 1, 1, 0, 1 },
          { 0, 1, 0, 0 },
          { 1, 1, 1, 1 } };
    paths(maze, 4, new StringBuilder(), 0, 0);
    for (int i = 0; i < result.size(); i++) {
      System.out.println(result.get(i).toString());
    }
  }
}
