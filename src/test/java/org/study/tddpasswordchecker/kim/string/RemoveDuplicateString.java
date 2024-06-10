package org.study.tddpasswordchecker.kim.string;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateString {
    public String removeDuplicated(String input) {
        Map<Character, Integer> map = new HashMap<>();
        String result = "";
        for (char ch : input.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
                result += ch;
            }
        }
        return result;
    }
}
