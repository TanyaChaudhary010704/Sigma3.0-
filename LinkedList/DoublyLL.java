public class DoublyLL {
  public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  //add
  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }
  //add last
  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
    tail.next = null;
  }

  //remove
  public int removeFirst() {
    if (head == null) {
      System.out.println("Empty");
      return Integer.MIN_VALUE;
    }

    if (size == 1) {
      int val = head.data;
      head = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
  }
  //remove last
  public int removeLast() {
    if (size == 0) {
      System.out.println("Empty");
      return Integer.MAX_VALUE;
    }
    else if (size == 1) {
      int val = tail.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = tail.data;
    Node prev = tail.prev;
    prev.next = null;
    tail.prev = null;
    tail = prev;
    size--;
    return val;
  }

  public void print() {
    Node temp = head;
    if (head == null) {
      System.out.println("Empty");
    }
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  //reverse 
  public void reverse() {
    Node prev = null;
    Node curr = head;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public static void main(String[] args) {
    DoublyLL ll = new DoublyLL();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.print();
    ll.removeFirst();
    ll.print();
    ll.addLast(4);
    ll.print();
    ll.removeLast();
    ll.print();
    ll.reverse();
    ll.print();
    
  }
}
