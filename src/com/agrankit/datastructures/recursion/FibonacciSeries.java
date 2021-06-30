package com.agrankit.datastructures.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 7;
        printSeries(0, 1, n);
        System.out.println(getNth(0, 1, n));
    }

    private static void printSeries(int f0, int f1, int n) {
        if (n == 0) {
            return;
        }

        System.out.println(f0);
        printSeries(f1, f0+f1, n-1);
    }

    private static int getNth(int f0, int f1, int n) {
        if (n == 1) {
            return f0;
        }
        return getNth(f1, f0+f1, n-1);
    }
}
