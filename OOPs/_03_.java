package OOPs;
//getter and setter
public class _03_ {
  public static void main(String[] args) {
  Pen p1 = new Pen();
  p1.setColor("blue");
  System.out.println(p1.getColor());

  p1.setTip(5);
  System.out.println(p1.getTip());
  
  System.out.println(p1.getColor());

  }
}
class Pen {
  private String color;
  private int tip;

  void setColor(String color) {
    this.color = color;
  }

  void setTip(int tip) {
    this.tip = tip;
  }
  
  String getColor() {
    return this.color;
  }

  int getTip() {
    return this.tip;
  }
}
