package com.leetcode;

public class ExcelSheetColumnTitle {

    /*Time complexity - O(log n) - it's actually base 26, but it's ignored for big O
      Space complexity - O(1) */

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0) {
            //we subtract 1 because it's not 0-based, but 1-based, 'A' corresponds to 1
            columnNumber--;
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber = columnNumber / 26;
        }

        return sb.reverse().toString();
    }
}
