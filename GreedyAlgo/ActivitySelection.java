import java.util.*;

public class ActivitySelection {
  public static void main(String[] args) {
    int start[] = { 1, 3, 0, 5, 8, 5 };
    int end[] = { 2, 4, 6, 7, 9, 9 };
    
    //sorting
    int activities[][] = new int[start.length][3];
    for (int i = 0; i < activities.length; i++) {
      activities[i][0] = i;
      activities[i][1] = start[i];
      activities[i][2] = end[i];
    }
    Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
    //now use activities array further 

    //when sorted
    int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    //choose 1st activity
    maxAct = 1;
    ans.add(0);
    int lastEnd = end[0];
    for (int i = 1; i < end.length; i++) {
      if (start[i]>=lastEnd) {
        maxAct++;
        ans.add(i);
        lastEnd = end[i];
      }
    }
    System.out.println("maxAct: " + maxAct);
    for (int i = 0; i < ans.size(); i++) {
      System.out.println("A"+ans.get(i)+" ");
    }
  }
}