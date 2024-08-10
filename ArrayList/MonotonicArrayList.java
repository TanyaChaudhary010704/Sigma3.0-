import java.util.ArrayList;
public class MonotonicArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    System.out.println(isMonotonic(list));
  }

  public static boolean isMonotonic(ArrayList<Integer> list) {
    int n = list.size();
    if (list.get(0) < list.get(n - 1)) {
      for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
          return false;
        }
      }
    }
    else {
      for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) < list.get(i + 1)) {
          return false;
        }
      }
    }
    
    return true;
  }
}

