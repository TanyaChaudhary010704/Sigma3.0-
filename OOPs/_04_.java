package OOPs;

public class _04_ {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1);
  }
}
class Student {
  String name;
  int roll;

  Student() {
    System.out.println("I am a student");
  }

  Student(int roll) {
    this.roll = roll;
  }
}