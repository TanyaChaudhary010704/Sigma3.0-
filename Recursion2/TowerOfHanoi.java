public class TowerOfHanoi {
  // 3 tower s , m , d
  // n disks to be moved to destination

  public static void main(String[] args) {
    toh(5,'A', 'B', 'C');
  }

  public static void toh(int n, char src, char med, char dest) {
    if (n == 1) {
      System.out.println(src + "->" + dest);
      return;
    }
    toh(n - 1, src, dest, med);
    toh(1, src, med, dest);
    toh(n - 1, med, src, dest);
  }
}
