package com.tentados;

import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        String s1 = "";

        for (int i = 0; i <= s.length(); i++) {
            if (!wordDict.contains(s1)) {
                if (i == s.length()) return false;
                s1 = s1 + s.charAt(i);
            } else {
                s1 = "";
                i--;
            }
        }
        return true;
    }
}
