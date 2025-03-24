
import java.util.*;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, minStart = 0, minLen = Integer.MAX_VALUE, count = t.length();
        while (right < s.length()) {
            if (map.getOrDefault(s.charAt(right), 0) > 0) count--;
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) - 1);
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) + 1);
                if (map.get(s.charAt(left)) > 0) count++;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
