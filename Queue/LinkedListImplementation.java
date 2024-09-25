package Queue;

public class LinkedListImplementation {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Queue {
    static Node head = null;
    static Node tail = null;

    public boolean isEmpty() {
      return head == null && tail == null;
    }

    public void add(int val) {
      Node newNode = new Node(val);
      if (isEmpty()) {
        head = tail = newNode;
        return;
      }
      tail.next = newNode;
      tail = newNode;
    }

    public int remove() {
      if (isEmpty()) {
        System.out.println("Empty queue");
        return -1;
      }
      int front = head.data;
      if (tail == head) {
        tail = head = null;
      } else {
        head = head.next;
      }
      return front;
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("Empty queue");
        return -1;
      }
      int front = head.data;
      return front;
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    for (int i = 0; i < 5; i++) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}

