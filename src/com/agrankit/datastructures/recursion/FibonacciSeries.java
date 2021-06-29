package com.agrankit.datastructures.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        printSeries(0, 1, 10);
    }

    private static void printSeries(int f0, int f1, int n) {
        if (n == 0) {
            return;
        }

        System.out.println(f0);
        printSeries(f1, f0+f1, n-1);
    }
}
