//package OOPs;
//method overriding
public class _07_ {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.A();
  }
}

class Animal {
  void A() {
    System.out.println("Parent method called");
  }
}

class Dog extends Animal {
  void A() {
    System.out.println("Child method called");
  }
}
