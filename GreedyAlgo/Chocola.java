import java.util.*;
public class Chocola {
  public static void main(String[] args) {
    Integer[] hCost = { 4, 1, 2 };
    Integer[] vCost = { 2, 1, 3, 1, 4 };
    int hPieces = 1;
    int vPieces = 1;
    int minCost =0;
    Arrays.sort(hCost, Comparator.reverseOrder());
    Arrays.sort(vCost,Comparator.reverseOrder());
    int i=0,j=0;
    while (i < hCost.length && j < vCost.length) {
      if (hCost[i] > vCost[j]) {
        minCost += (vPieces * hCost[i++]);
        hPieces++;
      } else {
        minCost += (hPieces * vCost[j++]);
        vPieces++;
      }
    }
    while (i < hCost.length) {
      minCost += (vPieces * hCost[i++]);
      hPieces++;
    }
    while (j < vCost.length) {
      minCost += (hPieces * vCost[j++]);
      vPieces++;
    }
    System.out.println(minCost);
  }
}
