package com.agrankit.datastructures.arrays;

/* https://practice.geeksforgeeks.org/problems/count-zeros-in-a-sorted-matrix/1 */
public class CountZerosInSortedMatrix {
  int countZeros(int A[][], int N)
  {
    int count = 0;
    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        if (A[i][j] == 0) {
          count++;
        } else {
          break;
        }
      }
    }
    return count;
  }
}
