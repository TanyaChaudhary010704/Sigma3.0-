//package OOPs;

//types of constructors
public class _04_ {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1);
    Student s2 = new Student(179);
    s2.marks[0] = 10;
    s2.marks[1] = 20;
    System.out.println(s2.roll);
    Student s3 = new Student(s2);
    System.out.println(s3.roll);
    s2.marks[1] = 11;
    for (int i = 0; i < 2; i++) {
      System.out.println(s3.marks[i]);
    }
  }
}

class Student {
  String name;
  int roll;
  int marks[];

  // non-parameterized
  Student() {
    marks = new int[2];
    System.out.println("I am a student");
  }

  // parameterized
  Student(int roll) {
    marks = new int[2];
    this.roll = roll;
  }

  // copy constructor
  Student(Student s) {
    marks = new int[2];
    this.roll = s.roll;
    //shallow copy constructor
    //this.marks = s.marks;
    //deep copy constructor
    for(int i=0;i<2;i++){
      this.marks[i]=s.marks[i];
    }
  }

}