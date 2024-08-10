import java.util.ArrayList;
import java.util.Collections;
public class LonelyNumber {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(3);
    list.add(5);
    list.add(3);
    ArrayList<Integer> result = new ArrayList<>();
    System.out.println(getLonely(list));
  }

  public static ArrayList<Integer> getLonely(ArrayList<Integer> list) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      int x = list.get(i);
      list.remove(i);
      if(!list.contains(x+1)&& !list.contains(x-1) && !list.contains(x)){
        result.add(x);
      }
      list.add(i,x);
    }
    return result;
  }
}
