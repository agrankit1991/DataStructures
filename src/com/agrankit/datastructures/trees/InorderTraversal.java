package com.agrankit.datastructures.trees;

import java.util.ArrayList;

public class InorderTraversal {

  // Function to return a list containing the inorder traversal of the tree.
  ArrayList<Integer> inOrder = new ArrayList<>();
  ArrayList<Integer> inOrder(Node root) {
    if (root == null) {
      return new ArrayList<>();
    }

    inOrder(root.left);
    inOrder.add(root.data);
    inOrder(root.right);
    return inOrder;
  }
}
