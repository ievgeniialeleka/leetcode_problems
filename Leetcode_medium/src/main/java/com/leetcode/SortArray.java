package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SortArray {

    /* Time complexity - O(n * log n)
       Space complexity - O(log n + n) = O(n) recursion + additional array */
    public static int[] sortArrayMergeSort(int[] a) {
        int[] aux = new int[a.length];
        mergeSort(a, aux, 0, a.length - 1);
        return a;
    }

    private static void mergeSort(int[] a,int[] aux, int low, int high) {
        if(low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(a, aux, low, mid);
        mergeSort(a, aux,mid + 1, high);
        if(a[mid] < a[mid + 1]) {
            return;
        }
        merge(a, aux, low, mid, high);
    }

    private static void merge(int[] a, int[] aux, int low, int mid, int high) {
        for(int i = low; i <= high; i++) {
            aux[i] = a[i];
        }

        int i = low;
        int j = mid + 1;
        for(int k = low; k <= high; k++) {
            if(i > mid) {
                a[k] = aux[j++];
            } else if(j > high) {
                a[k] = aux[i++];
            } else if(aux[i] <= aux[j]) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    /* Time complexity - O(n + k) where n is the number of the elements in the original array and
       k is a range between min and max value in the array
       Space complexity - O(n) - we are using HashMap to store the frequencies
     */
    public static int[] sortArrayCountingSort(int[] a) {
        countingSort(a);
        return a;
    }

    private static void countingSort(int[] a) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int minValue = a[0];
        int maxValue = a[0];

        for(int i = 0; i < a.length; i++) {
            if(a[i] > maxValue) {
                maxValue = a[i];
            }
            if(a[i] < minValue) {
                minValue = a[i];
            }
            frequency.put(a[i], frequency.getOrDefault(a[i], 0) + 1);
        }

        int index = 0;
        for(int min = minValue; min <= maxValue; min++) {
            while(frequency.getOrDefault(min, 0) != 0) {
                a[index++] = min;
                frequency.put(min, frequency.get(min) - 1);
            }
        }
    }
}
