package datastructures.linkedlist;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = next;
    }
}
class Datastructure {
  Node head;
  Node tail;

    public Datastructure() {
        this.head = null;
        this.tail = head;
    }

    void insertEnd(int data){

    if (head == null){
        head = new Node(data);
        tail = head;
        return;
    }

    tail.next = new Node(data);
    tail = tail.next;
  }

  void printLinkedList(){
      Node current = head;
      while (current != null){
          System.out.println(current.data);
          current = current.next;
      }
  }

  void delete(int data){
        Node current = head;

      while (current.next != null){
          if (current.next.data == data){
              current.next = current.next.next;
          }else {
              current = current.next;
          }
      }
  }

}
public class Linkedlist{
    public static void main(String[] args) {
       Datastructure linkedList = new Datastructure();
        linkedList.insertEnd(5);
        linkedList.insertEnd(3);
        linkedList.insertEnd(6);
        linkedList.insertEnd(2);
        linkedList.insertEnd(7);
        linkedList.insertEnd(9);
        linkedList.delete(2);
        linkedList.printLinkedList();
    }
}