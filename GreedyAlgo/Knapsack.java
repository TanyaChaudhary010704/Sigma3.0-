import java.util.Arrays;
import java.util.Comparator;
public class Knapsack {
  public static void main(String[] args) {
    int val[] ={60,100,120};
    int wt[] = { 10, 20, 30 };
    int capacity = 50;
    double ratio[][] = new double[val.length][2];
    //0 th col = idx , 1st col = ratio
    for (int i = 0; i < val.length; i++) {
      ratio[i][0] = i;
      ratio[i][1] = val[i] / (double) wt[i];
    }
    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
    double maxValue = 0;
    for (int i = ratio.length - 1; i >= 0; i--) {
      int idx = (int) ratio[i][0];
      if (capacity >= wt[idx]) {
        maxValue += val[idx];
        capacity -= wt[idx];
      } else {
        maxValue += (capacity * ratio[i][1]);
        break;
      }
    }
    System.out.println(maxValue);
  }
}
