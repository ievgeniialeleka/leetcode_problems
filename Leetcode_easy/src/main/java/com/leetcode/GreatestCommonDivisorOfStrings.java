package com.leetcode;

public class GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        for (int i = Math.min(l1, l2); i >= 1; i--) {
            if (valid(str1, str2, i)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }

    private static boolean valid(String str1, String str2, int k) {
        int l1 = str1.length();
        int l2 = str2.length();
        if (l1 % k > 0 || l2 % k > 0) {
            return false;
        } else {
            String base = str1.substring(0, k);
            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }
    }

    public static String gcdOfStrings2(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        if ((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0, gcd(l1, l2));
        }
        return "";
    }

    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
