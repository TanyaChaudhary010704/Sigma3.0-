import java.util.ArrayList;
public class PairSum1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    int[] result = pairsum(list, 6);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

  public static int[] pairsum(ArrayList<Integer> list, int target) {
    int left = 0;
    int right = list.size() - 1;
    while (left < right) {
      if (list.get(left) + list.get(right)==target) {
        return new int[]{left, right};
      }
      else if(list.get(left) + list.get(right)<target){
        left++;
      }
      else{
        right--;
      }
    }
    return new int[]{-1, -1};
  }
}

