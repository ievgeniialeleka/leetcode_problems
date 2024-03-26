package com.leetcode;

public class ExcelSheetColumnNumber {

    /*Time complexity - O(n)
      Space complexity - O(1) */

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++) {
            result = result * 26;
            result += columnTitle.charAt(i) - 'A' + 1;
        }
        return result;
    }

    /*Time complexity - O(n)
      Space complexity - O(1) */

    public static int titleToNumber1(String columnTitle) {
        int result = 0;
        int n = columnTitle.length();
        for(int i = 0; i < n; i++) {
            char c = columnTitle.charAt(n - 1 - i);
            result += (c - 'A' + 1) * Math.pow(26, i);
        }
        return result;
    }
}
