import java.util.*;

public class LongestSubstringTwoDistinct {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), right);

            if (map.size() > 2) {
                int minIndex = Collections.min(map.values());
                map.remove(s.charAt(minIndex));
                left = minIndex + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
