package com.agrankit.datastructures.linkedlist;

public class NodeAtAGivenIndex {
  public static void main(String[] args) {
    Node head = new Node();
    head.data = 0;
    head.next = null;

    Node current = head;
    for (int i = 0; i < 5; i++) {
      Node temp = new Node();
      temp.data = i+1;
      temp.next = null;
      current.next = temp;
      current = current.next;
    }
    System.out.println(getNth(head, 3));
  }

  private static int getNth(final Node head, int index) {
    Node temp = head;
    int count = 0;
    while (temp != null) {
      if (++count == index) {
        return temp.data;
      }
      temp = temp.next;
    }
    return 0;
  }
}
