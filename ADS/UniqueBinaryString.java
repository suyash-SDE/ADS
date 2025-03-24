import java.util.*;

public class UniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>(Arrays.asList(nums));
        return dfs(set, "", nums.length);
    }

    private String dfs(Set<String> set, String s, int n) {
        if (s.length() == n) return set.contains(s) ? "" : s;
        String res = dfs(set, s + "0", n);
        return res.isEmpty() ? dfs(set, s + "1", n) : res;
    }
}

