//package OOPs;

public class _09_ {
  public static void main(String[] args) {
    Child c = new Child();
    c.nature();
    c.sirname();
  }
}

interface Father {
  void sirname();
}

interface Mother {
  void nature();
}
class Child implements Father , Mother  {
  public void sirname() {
    System.out.println("Sain");
  }

  public void nature() {
    System.out.println("Calm");
  }
}
