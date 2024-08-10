import java.util.ArrayList;
//sorted and rotated array
public class PairSum2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int[] result = pairsum(list, 16);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

  public static int[] pairsum(ArrayList<Integer> list, int target) {
    int pivot = -1;
    for (int i = 0; i < list.size()-1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        pivot = i;
        break;
      }
    }

    int left = pivot+1;
    int right =pivot;
    while (left != right) {
      if (list.get(left) + list.get(right)==target) {
        return new int[]{left, right};
      }
      else if(list.get(left) + list.get(right)<target){
        left = (left+1)%list.size();
      }
      else{
        right = (list.size() - 1 + right) % list.size();
      }
    }
    return new int[]{-1, -1};
  }
}
