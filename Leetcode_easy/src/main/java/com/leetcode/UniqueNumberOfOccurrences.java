package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    /* Time complexity - O(n)
       Space complexity - O(n) */
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mapFrequencies = new HashMap<>();
        for (int i : arr) {
            mapFrequencies.put(i, mapFrequencies.getOrDefault(i, 0) + 1);
        }

        Set<Integer> setFrequencies = new HashSet<>();
        for (int i : mapFrequencies.values()) {
            if (setFrequencies.contains(i)) {
                return false;
            } else {
                setFrequencies.add(i);
            }
        }
        return true;
    }

    public static boolean uniqueOccurrences1(int[] arr) {
        Map<Integer, Integer> mapFrequencies = new HashMap<>();
        for (int i : arr) {
            mapFrequencies.put(i, mapFrequencies.getOrDefault(i, 0) + 1);
        }

        Set<Integer> setFrequencies = new HashSet<>();
        for (Map.Entry<Integer, Integer> map : mapFrequencies.entrySet()) {
            setFrequencies.add(map.getValue());
        }
        return mapFrequencies.size() == setFrequencies.size();
    }

    public static boolean uniqueOccurrences2(int[] arr) {
        Map<Integer, Integer> mapFrequencies = new HashMap<>();
        for (int i : arr) {
            mapFrequencies.put(i, mapFrequencies.getOrDefault(i, 0) + 1);
        }
        Set<Integer> setFrequencies = new HashSet<>(mapFrequencies.values());
        return mapFrequencies.size() == setFrequencies.size();
    }
}
