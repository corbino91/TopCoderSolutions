package com.corbin.topcoder;

/**
 * Scored 237
 */
public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        // use string builder for efficiency - string are immutable
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rights.length; i++) {
            if (rights[i] >= minPermission) {
                sb.append("A");
            } else {
                sb.append("D");
            }
        }

        return sb.toString();
    }
}
