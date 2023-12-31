package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        Map<String, List> answer = new HashMap<>();
        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            //Option 1
            if(!answer.containsKey(key)) answer.put(key, new ArrayList());
            answer.get(key).add(s);

            //Option 2
//            List<String> val = answer.getOrDefault(key, new ArrayList<>());
//            val.add(s);
//            answer.put(key, val);
        }
        return new ArrayList(answer.values());
    }

    public static void main(String[] args) {
      String[] strs = {"eat","tea","tan","ate","nat","bat"};
      List<List<String>> anagrams_grouped = groupAnagrams(strs);
      for(List<String> list : anagrams_grouped) {
          for(String s : list) {
              System.out.print(s + " ");
          }
          System.out.println();
      }

    }
}
