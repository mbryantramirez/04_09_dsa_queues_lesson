package nyc.pursuit;

public class MyQueue {

  QueueNode front;
  QueueNode tail;
  int size;

  MyQueue() {
    front = null;
    tail = null;
    size = 0;
  }

  public void enqueue(String name) {
    QueueNode temp = new QueueNode(name);
    if (tail != null) {
      tail.next = temp;
    }
    tail = temp;
    if (front == null) {
      front = tail;
    }
    size++;
  }

  public void dequeue() {
    front = front.next;
    if (front == null) {
      tail = front;
    }
    size--;
  }

  public void print() {
    QueueNode temp = front;

    while (temp != null) {
      System.out.print(temp.name + " ===> ");
      temp = temp.next;
    }
    System.out.println("NIL\n");
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return front == null;
  }

}
