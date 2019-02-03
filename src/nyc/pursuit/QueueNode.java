package nyc.pursuit;

public class QueueNode {

  String name;
  QueueNode next;

  public QueueNode(String name) {
    this.name = name;
    next = null;
  }
}
