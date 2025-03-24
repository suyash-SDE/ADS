import java.util.*;

public class KthHappyString {
    private List<String> list = new ArrayList<>();

    public String getHappyString(int n, int k) {
        backtrack(n, new StringBuilder(), k);
        return list.size() >= k ? list.get(k - 1) : "";
    }

    private void backtrack(int n, StringBuilder sb, int k) {
        if (sb.length() == n) {
            list.add(sb.toString());
            return;
        }

        for (char c : new char[]{'a', 'b', 'c'}) {
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != c) {
                sb.append(c);
                backtrack(n, sb, k);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
