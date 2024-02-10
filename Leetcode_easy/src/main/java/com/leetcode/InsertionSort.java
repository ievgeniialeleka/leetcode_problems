package com.leetcode;

public class InsertionSort {

    /*Time complexity - O(n^2)
      Space complexity - O(1) */
    public static int[] insertionSort(int[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if(a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return a;
    }
}
