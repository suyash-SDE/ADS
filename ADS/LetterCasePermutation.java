import java.util.*;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtrack(res, s.toCharArray(), 0);
        return res;
    }

    private void backtrack(List<String> res, char[] chars, int i) {
        if (i == chars.length) {
            res.add(new String(chars));
            return;
        }
        backtrack(res, chars, i + 1);
        if (Character.isLetter(chars[i])) {
            chars[i] ^= 32; // Toggle case
            backtrack(res, chars, i + 1);
            chars[i] ^= 32; // Revert change
        }
    }
}

