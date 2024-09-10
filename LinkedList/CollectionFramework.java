import java.util.LinkedList;
public class CollectionFramework {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    ll.addLast(8);
    ll.addLast(9);
    ll.addLast(10);
    System.out.println(ll);
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);
  }
}
