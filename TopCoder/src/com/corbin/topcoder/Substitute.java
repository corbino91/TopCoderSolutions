package com.corbin.topcoder;

import java.util.*;

/**
 * 113.6 / 250
 */
public class Substitute {
    public int getValue(String key, String code) {
        Map<Character, Integer> stringPositionMap = new HashMap<>();
        Set<Character> keySet = new LinkedHashSet<>();
        Set<Character> codeSet = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < key.length(); i++) {
            keySet.add(key.charAt(i));
            stringPositionMap.put(key.charAt(i), i+1);
        }

        for(int i = 0; i < code.length(); i++) {
            codeSet.add(code.charAt(i));
        }

        codeSet.retainAll(keySet);

        for (Character letter : codeSet) {
            sb.append(stringPositionMap.get(letter));
        }

        if (sb.length() == 0) {
            sb.append(0);
        }

        return Integer.parseInt(sb.toString());
    }
}
