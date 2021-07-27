package com.agrankit.datastructures.linkedlist;

// Given a linked list. Print all the elements of the linked list.
//
//    Example 1:
//    Input:
//    N=2
//    LinkedList={1 , 2}
//    Output:
//    1 2
//    Explanation:
//    The linked list contains two
//    elements 1 and 2.The elements
//    are printed in a single line.
//
//    Example 2:
//    Input:
//    N = 3
//    Linked List = { 49, 10, 30}
//    Output:
//    49 10 30
//    Explanation:
//    The linked list contains 3
//    elements 49, 10 and 30. The
//    elements are printed in a single
//    line.
//
//    Your task:
//    You don't need to read input or print anything. Your task is to complete the function display() which takes the head of the linked list as input and prints the linked list in a single line.
//
//    Expected Time Complexity : O(N)
//    Expected Auxiliary Space : O(1)
//
//    Constraints :
//    1 <= N <= 100
public class PrintLinkedListElements {

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
    display(head);
  }

  private static void display(final Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}

