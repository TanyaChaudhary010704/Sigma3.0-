import java.util.ArrayList;

public class BeautifulArayList {
  public static void main(String[] args) {
    System.out.println(beautifulArray(6));
  }
  //0 1 2 3 4 5 6 7 8 9
  //1 0 3 2 5 4 7 6 9 8
  public static ArrayList<Integer> beautifulArray(int n){
    ArrayList<Integer> result = new ArrayList<>();
    result.add(1);
    while (result.size() < n) {
      ArrayList<Integer> temp = new ArrayList<>();
      for (Integer e : result) {
        if (e * 2 - 1 <= n) {
          temp.add(e*2-1);
        }
      }
      for (Integer e : result) {
        if (e * 2 <= n) {
          temp.add(e * 2);
        }
      }
      result = temp;
    }
    return result;
  }
}
