public class IndianCoins {
  public static void main(String[] args) {
    int[] currency = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
    int amount = 590;
    int count = 0;
    int i = 0;
    while (amount != 0) {
      if (currency[i] > amount) {
        i++;
      } else {
        amount -= currency[i];
        System.out.print("+" + currency[i]);
        count++;
      }
    }
    System.out.println();
    System.out.println(count);
  }
}
