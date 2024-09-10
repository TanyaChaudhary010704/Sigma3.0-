
public class LinkedList1 {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void add(int index, int data) {
    if (index == 0) {
      addFirst(data);
      return;
    }
    int i = 0;
    Node newNode = new Node(data);
    size++;
    Node temp = head;

    while (i != index - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

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
    Node temp = head;
    for (int i = 0; i < size - 2; i++) {
      temp = temp.next;
    }
    temp.next = null;
    size--;
    return val;
  }
  
  public int removeFirst() {
    if (size == 0) {
      System.out.println("Empty");
      return Integer.MAX_VALUE;
    }
    else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
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
  
  private Node findMid(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public int search(int value) {
    Node temp = head;
    int i = 0;
    if (head == null) {
      System.out.println("Empty");
    }
    while (temp != null) {
      if (temp.data == value) {
        return i;
      }
      temp = temp.next;
      i++;
    }
    return -1;
  }

  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;
    }
    return idx + 1;
  }

  public int search2(int value) {
    return helper(head, value);
  }

  public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }
  
  public void removeNthFromLast(int n) {
    int sz = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      sz++;
    }

    if (n == sz) {
      head = head.next;//remove first
      return;
    }
    int i = 1;
    int iToFind = sz - n;
    Node prev = head;
    while (i < iToFind) {
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
    return;
  }
  
  //merge
  private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }
    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }
    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }
    return mergedLL.next;
  }
  //merge sort
  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    //find mid
    Node mid = findMid(head);
    //left and right merge sort
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);
    //merge
    return merge(newLeft, newRight);
  }

  public boolean isPalindrome() {
    if (head == null || head.next == null) {
      return true;
    }
    //find mid;
    Node mid = findMid(head);

    //reverse linked list of next half
    Node prev = null;
    Node curr = mid;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node right = prev;
    Node left = head;

    //check left half and right half
    while (right != null) {
      if (left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }

  public void zigZag() {
    if (head == null || head.next == null) {
      return ;
    }
    //find mid;
    Node mid = findMid(head);

    //reverse linked list of next half
    Node prev = null;
    Node curr = mid.next;
    mid.next = null;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node right = prev;
    Node left = head;
    Node nextL, nextR;
    //merge in zig-zag order
    while (left != null && right != null) {
      nextL = left.next;
      nextR = right.next;
      left.next = right;
      right.next = nextL;

      left = nextL;
      right = nextR;
    }
    
  }

  
  
  public static void main(String[] args) {
    
    LinkedList1 ll2 = new LinkedList1();
    ll2.addLast(20);
    ll2.addLast(3);
    ll2.addLast(12);
    ll2.addLast(15);
    ll2.addLast(2);
    ll2.addLast(1);
    ll2.print();
    //zig-zag ll
    ll2.zigZag();
    ll2.print();
  }
}