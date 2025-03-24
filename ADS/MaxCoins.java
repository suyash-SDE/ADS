import java.util.*;

public class MaxCoins {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0, n = piles.length / 3;
        for (int i = n; i < piles.length; i += 2) res += piles[i];
        return res;
    }
}
