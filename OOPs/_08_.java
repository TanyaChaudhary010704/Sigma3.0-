package OOPs;
//Abstract class
public class _08_ {
  public static void main(String[] args) {
    //Animal a = new Animal();// Wrong 
    Horse h = new Horse();
    h.eat();
    h.walk();
    Chicken c = new Chicken();
    c.eat();
    c.walk();
  }
}

abstract class Animal {
  String color;

  Animal() {
    color = "black";
  }
  void eat() {
    System.out.println("Eats");
  }

  abstract void walk();
}

class Horse extends Animal {
  void changeColor() {
    color = "brown";
  }
  void walk() {
    System.out.println("Walking");
  }
}

class Chicken extends Animal {
  void changeColor() {
    color = "Yellow";
  }
  void walk() {
    System.out.println("chicken walks");
  }
}
