import java.util.*;

public class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return dfs(countMap);
    }

    private int dfs(Map<Character, Integer> countMap) {
        int sum = 0;
        for (char key : countMap.keySet()) {
            if (countMap.get(key) == 0) continue;
            sum++;
            countMap.put(key, countMap.get(key) - 1);
            sum += dfs(countMap);
            countMap.put(key, countMap.get(key) + 1);
        }
        return sum;
    }
}

