public class Practice {
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
    } else if (size == 1) {
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
    } else if (size == 1) {
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

  public Node intersection(Node head1, Node head2) {
    if (head1 == null || head2 == null) {
      return null;
    }
    Node a = head1;
    Node b = head2;
    while (a != b) {
      a = a == null ? head2 : a.next;
      b = b == null ? head1 : b.next;
    }
    return a;
  }

  public void deleteNAfterM(int M, int N) {
    Node curr = head, t;
    int count;
    while (curr != null) {
      for (count = 1; count < M && curr != null; count++) {
        curr = curr.next;
      }
      if (curr == null)
        return;
      t = curr.next;
      for (count = 1; count <= N && t != null; count++) {
        Node temp = t;
        t = t.next;
      }
      curr.next = t;
      curr = t;
    }
  }

  // optimization
  public void deleteNAfterM2(int M, int N) {
    Node curr = head;
    Node prev = null;
    int countM = M;
    int countN = N;
    Node st1 = null;
    boolean flag = true;
    while (curr != null && N > 0) {
      if (countM == 0) {
        flag = false;
        countM = M;
        st1 = prev;
      }
      if (countN == 0) {
        flag = true;
        countN = N;
        st1.next = curr;
      }
      if (flag) {
        countM--;
      } else {
        countN--;
      }
      prev = curr;
      curr = curr.next;
    }
    if (countN != N) {
      st1.next = null;
    }
  }

  public void swap(int x, int y) {
    if (x == y)
      return;

    Node prevX = null, currX = head;
    while (currX != null && currX.data != x) {
      prevX = currX;
      currX = currX.next;
    }

    Node prevY = null, currY = head;
    while (currY != null && currY.data != y) {
      prevY = currY;
      currY = currY.next;
    }
    if (currX == null || currY == null)
      return;

    if (prevX != null)
      prevX.next = currY;

    else
      head = currY;

    if (prevY != null)
      prevY.next = currX;

    else
      head = currX;
    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
  }

  public void segregateEvenOdd() {
    Node curr = head;
    Node prev = null;
    Node newEnd = tail;
    // find the end if not declared before
    while (curr.data % 2 != 0 && curr != tail) {
      newEnd.next = curr;
      curr = curr.next;
      newEnd.next.next = null;
      newEnd = newEnd.next;
    }
    if (curr.data % 2 == 0) {
      head = curr;
      while (curr != tail) {
        if (curr.data % 2 == 0) {
          prev = curr;
          curr = curr.next;
        } else {
          prev.next = curr.next;
          curr.next = null;
          newEnd.next = curr;
          newEnd = curr;
          curr = prev.next;
        }
      }
    } else {
      prev = curr;
    }
    if (newEnd != tail && tail.data % 2 != 0) {
      prev.next = tail.next;
      tail.next = null;
      newEnd.next = tail;
    }

  }

  public static Node SortedMerge(Node a, Node b) {
    Node result = null;
    if (a == null)
      return b;
    else if (b == null)
      return a;
    if (a.data <= b.data) {
      result = a;
      result.next = SortedMerge(a.next, b);
    } else {
      result = b;
      result.next = SortedMerge(a, b.next);
    }
    return result;
  }

  public static Node mergeKLists(Node arr[], int last) {
    while (last != 0) {
      int i = 0, j = last;
      while (i < j) {
        arr[i] = SortedMerge(arr[i], arr[j]);
        i++;
        j--;
        if (i >= j)
          last = j;
      }
    }
    return arr[0];
  }

  public static void main(String[] args) {
    Practice list = new Practice();
    // ------------for intersection -------------------------------
    // Node head1, head2;
    // head1 = new Node(1);
    // head2 = new Node(4);
    // Node newNode = new Node(2);
    // head1.next = newNode;
    // newNode = new Node(3);
    // head1.next.next = newNode;
    // newNode = new Node(5);
    // head2.next = newNode;
    // newNode = new Node(6);
    // head1.next.next.next = newNode;
    // head2.next.next= newNode;
    // newNode = new Node(7);
    // head1.next.next.next.next = newNode;
    // head1.next.next.next.next.next = null;
    // Node intersection = list.intersection(head1, head2);
    // if (intersection != null) {
    // System.out.println(intersection.data);
    // }
    // ------------for delete n after m----------------------------------
    // list.addLast(1);
    // list.addLast(2);
    // list.addLast(3);
    // list.addLast(4);
    // list.addLast(5);
    // list.addLast(6);
    // list.addLast(7);
    // list.addLast(8);
    // list.addLast(9);
    // list.addLast(10);
    // list.print();
    // list.deleteNAfterM(2, 2);
    // list.print();
    // -----------Swapping nodes----------------------
    // list.addLast(1);
    // list.addLast(2);
    // list.addLast(3);
    // list.addLast(4);
    // list.addLast(5);
    // list.addLast(6);
    // list.print();
    // list.swap(2, 4);
    // list.print();
    // list.segregateEvenOdd();
    // list.print();

    // merge k sorted lists
    int k = 3;
    int n = 4;
    
    Node arr[] = new Node[k];
    arr[0] = new Node(1);
    arr[0].next = new Node(3);
    arr[0].next.next = new Node(5);
    arr[0].next.next.next = new Node(7);

    arr[1] = new Node(2);
    arr[1].next = new Node(4);
    arr[1].next.next = new Node(6);
    arr[1].next.next.next = new Node(8);

    arr[2] = new Node(0);
    arr[2].next = new Node(9);
    arr[2].next.next = new Node(10);
    arr[2].next.next.next = new Node(11);

    Node head = mergeKLists(arr, k - 1);
    list.head = head;
    list.print();

  }
}
