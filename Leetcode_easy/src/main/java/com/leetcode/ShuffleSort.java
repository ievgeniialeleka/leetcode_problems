package com.leetcode;

import java.util.Random;

public class ShuffleSort {

    //Uniformly random permutation
    public static int[] shuffleSort(int[] a) {
        Random rand = new Random();
        for(int i = 0; i < a.length; i++) {
            int r = rand.nextInt(i + 1);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
        return a;
    }
}
