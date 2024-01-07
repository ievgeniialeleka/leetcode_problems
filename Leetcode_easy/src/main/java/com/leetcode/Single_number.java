package com.leetcode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Single_number {

    /** Time complexity O(n) - linear runtime.
     * Space complexity  - O(1) - constant
     */
    public static int singleNumber(int[] nums) {
        int a = 0;
        for(int i : nums) {
            a ^= i;
        }
        return a;
    }

    /** Time complexity O(n^2) - checking if List contains a value within for loop
     * Space complexity  - O(n)
     */
    public static int singleNumberList(int[] nums) {
        List<Integer> no_duplicates_list = new ArrayList<>();

        for(int i : nums) {
            if(!no_duplicates_list.contains(i)) {
                no_duplicates_list.add(i);
            } else {
                no_duplicates_list.remove(new Integer(i));
            }
        }
        return no_duplicates_list.get(0);
    }

    /** Time complexity O(n)
     * Space complexity  - O(n)
     */
    public static int singleNumberHashTable(int[] nums) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for(int i : nums) {
            table.put(i, table.getOrDefault(i, 0) + 1);
        }

        for(int i : nums) {
            if(table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
