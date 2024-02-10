package com.leetcode;

public class SortArray {

    public static int[] sortArray(int[] a) {
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
}
