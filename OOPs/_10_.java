//package OOPs;
//Static keyword in java
//Static variable
public class _10_ {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student.school = "AMU";
    Student s2 = new Student();
    System.out.println(s2.school);
  }
}

class Student {
  String name;
  int roll;
  static String school;

  void setName(String name) {
    this.name = name;
  }

  void setRoll(int roll) {
    this.roll = roll;
  }
}
