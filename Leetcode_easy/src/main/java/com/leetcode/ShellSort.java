package com.leetcode;

public class ShellSort {

    public static int[] shellSort(int[] a) {
        int h = 1;
        while(h < a.length/3) {
            h = h * 3 + 1;
        }
        while(h >= 1) {
            for(int i = h; i < a.length; i++) {
                for(int j = i; j >= h; j -= h) {
                    if(a[j] < a[j - h]) {
                        int temp = a[j];
                        a[j] = a[j - h];
                        a[j - h] = temp;
                    }
                }
            }
            h /= 3;
        }
        return a;
    }
}
