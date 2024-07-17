package OOPs;

//inheritance
public class _05_ {
  public static void main(String[] args) {
    //Hybrid - Combination of all
    //Single Level
    Fish shark = new Fish();
    shark.eat();
    shark.breathe();
    shark.swim();
    //Multi Level
    BabyFish f = new BabyFish();
    f.eat();
    f.breathe();
    f.swim();
    f.small();
    //Hierarchical
    Dog d1 = new Dog();
    d1.eat();
    d1.breathe();
    d1.bark();
  }
}
//Superclass
class Animal {
  String color;

  void eat() {
    System.out.println("Eats");
  }

  void breathe() {
    System.out.println("Breathes");
  }
}
//Single Level Inheritance
//Subclass 1
class Fish extends Animal {
  int fins;

  void swim() {
    System.out.println("Swims");
  }
}
//Hierarchy Inheritance
//Subclass 2
class Dog extends Animal {
  void bark() {
    System.out.println("Barks");
  }
}
//Multi Level Inheritance
//Grand child 
class BabyFish extends Fish {
  int fins;

  void small() {
    System.out.println("its small");
  }
}