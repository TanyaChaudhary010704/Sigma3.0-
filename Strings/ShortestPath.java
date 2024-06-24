package Strings;
//Given a route containing directions (n,s,e,w), find the shortest path to reach destination
public class ShortestPath {
  public static void main(String[] args) {
    System.out.println(shortestPath("WNEENESENNN"));
  }

  public static double shortestPath(String route) {
    int[] coordinates = {0,0};
    double dis = 0;
    for (char direction : route.toCharArray()) {
      if (direction == 'N')
        coordinates[1]++;
      if (direction == 'S')
        coordinates[1]--;
      if (direction == 'E')
        coordinates[0]++;
      if (direction == 'W')
        coordinates[0]--;
    }
    dis = Math.sqrt(coordinates[0] * coordinates[0] + coordinates[1] * coordinates[1]);
    return dis;
  }
}
