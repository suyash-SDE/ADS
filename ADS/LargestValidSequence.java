import java.util.*;

public class LargestValidSequence {
    public int[] constructDistancedSequence(int n) {
        int[] res = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1];
        dfs(res, used, 0, n);
        return res;
    }

    private boolean dfs(int[] res, boolean[] used, int pos, int n) {
        if (pos == res.length) return true;
        if (res[pos] != 0) return dfs(res, used, pos + 1, n);

        for (int i = n; i > 0; i--) {
            if (used[i]) continue;
            if (i != 1 && (pos + i >= res.length || res[pos + i] != 0)) continue;

            res[pos] = i;
            if (i != 1) res[pos + i] = i;
            used[i] = true;

            if (dfs(res, used, pos + 1, n)) return true;

            res[pos] = 0;
            if (i != 1) res[pos + i] = 0;
            used[i] = false;
        }
        return false;
    }
}

