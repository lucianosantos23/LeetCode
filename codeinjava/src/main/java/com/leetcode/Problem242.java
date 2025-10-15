package com.leetcode;

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            Integer count = map.get(c);
            if (count == null || count == 0) return false;
            map.put(c, count - 1);
        }

        return true;
    }
}

