//package OOPs;
import java.util.Scanner;
public class _11_ {
  public static void main(String[] args) {
    // x+iy
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter real part of 1st number:");
    int x1 = sc.nextInt();
    System.out.println("Enter imaginary part of 1st number:");
    int y1 = sc.nextInt();
    System.out.println("Enter real part of 2nd number:");
    int x2 = sc.nextInt();
    System.out.println("Enter imaginary part of 2nd number:");
    int y2 = sc.nextInt();
    Complex c = new Complex();
    c.sum(x1, y1, x2, y2);
    c.product(x1, y1, x2, y2);
    c.difference(x1, y1, x2, y2);
  }
}

class Complex {
  void sum(int x1, int y1,int x2,int y2) {
    System.out.println("Complex sum :" + (x1+x2) +"+"+(y1+y2)+"i");
  }

  void product(int x1, int y1, int x2, int y2) {
    System.out.println("Complex Product :" + (x1*x2 - y1*y2) +"+"+(x2*y1+x1*y2)+"i");
  }

  void difference(int x1, int y1, int x2, int y2) {
    System.out.println("Complex Difference :" + (x1-x2) +"+"+(y1-y2)+"i");
  }
}
