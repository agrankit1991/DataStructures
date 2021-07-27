package com.agrankit.datastructures.arrays;

// link: https://practice.geeksforgeeks.org/problems/multiply-matrices/1
// Given two square Matrices A[][] and B[][].
// Your task is to complete the function multiply which stores the multiplied matrices
// in a new matrix C[][].
//    Example 1:
//
//    Input:
//    N = 2
//    A[][] = {{7, 8}, {2 , 9}}
//    B[][] = {{14, 5}, {5, 18}}
//
//    Output:
//    C[][] = {{188, 359}, {73, 172}}
//
//    Example 2:
//    Input:
//    N = 2
//    A[][] = {{17, 4}, {17 , 16}}
//    B[][] = {{9, 2}, {7, 1}}
//
//    Output:
//    C[][] = {{181, 38}, {265, 50}}
//
//    Constraints:
//    1 <=T<= 100
//    1 <= N <= 20
public class MultiplyMatrices {

  public static void main(String[] args) {
    int a[][] = {{7, 8},
                 {2, 9}};
    int b[][] = {{14, 5},
                 {5, 18}};

    int result[][] = new int[2][2];

    for(int i=0; i<2; i++) {
      for(int j=0; j<2; j++) {
        int sum = 0;
        for (int k=0; k<2; k++) {
          sum = sum + (a[i][k] * b[k][j]);
        }
        result[i][j] = sum;
      }
    }

    for(int i=0; i<2; i++){
      for (int j = 0; j < 2; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }

  }
}
