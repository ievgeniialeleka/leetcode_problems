package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/* Time complexity - O(1)
   Space complexity - O(1) */
public class NumberOfRecentCalls {

    private List<Integer> list;

    public NumberOfRecentCalls() {
        this.list = new LinkedList<>();
    }

    public int ping(int t) {
        this.list.add(t); //this.list.addLast(t);
        while(this.list.get(0) < t - 3000) { //this.list.getFirst()
            this.list.remove(0);  //this.list.removeFirst()
        }

        return this.list.size();
    }
}
