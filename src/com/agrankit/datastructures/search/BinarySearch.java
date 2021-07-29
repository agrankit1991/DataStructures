package com.agrankit.datastructures.search;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    System.out.println(binarySearch(arr, 5, 1));
  }

  private static int binarySearch(int arr[], int n, int k) {
    int low = 0;
    int high = n-1;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == k) {
        return mid;
      }
      if (arr[mid] < k) {
        low = mid+1;
      } else {
        high = mid-1;
      }
    }
    return -1;
  }
}
