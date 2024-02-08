package com.leetcode;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] input) {
        if(input.length <= 1) {
            return input;
        }
        int mid = input.length / 2;
        int[] leftSide = mergeSort(Arrays.copyOfRange(input, 0, mid));
        int[] rightSide = mergeSort(Arrays.copyOfRange(input, mid, input.length));
        return merge(leftSide, rightSide);
    }

    private static int[] merge(int[] leftSide, int[] rightSide) {
        int[] aux = new int[leftSide.length + rightSide.length];
        int leftIndex = 0;
        int rightIndex = 0;
        //  int auxIndex = 0;

        for(int i = 0; i < aux.length; i++) {
            if(leftIndex >= leftSide.length) {
                aux[i] = rightSide[rightIndex++];
            } else if(rightIndex >= rightSide.length) {
                aux[i] = leftSide[leftIndex++];
            } else if(leftSide[leftIndex] <= rightSide[rightIndex]) {
                aux[i] = leftSide[leftIndex++];
            } else {
                aux[i] = rightSide[rightIndex++];
            }
        }
        return aux;
    }
}
