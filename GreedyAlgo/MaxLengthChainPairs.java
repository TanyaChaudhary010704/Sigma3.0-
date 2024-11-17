import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
public class MaxLengthChainPairs {
  public static void main(String[] args) {
    int pairs[][]= {
      {5,24},{39,60},{5,28},{27,40},{50,90}
    };
    Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
    ArrayList<Integer> ans = new ArrayList<Integer>();
    ans.add(0);
    int len = 1;
    int prevEnd = pairs[0][1];
    for (int i = 1; i < pairs.length; i++) {
      if (pairs[i][0] > prevEnd) {
        ans.add(i);
        len++;
        prevEnd = pairs[i][1];
      }
    }
    System.out.println("Length of chain :" + len);
    for (int i = 0; i < ans.size(); i++) {
      System.out.println("P"+ans.get(i).toString());
    }
  }
}
