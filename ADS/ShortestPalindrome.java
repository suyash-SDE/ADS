public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        int[] lps = new int[combined.length()];

        for (int i = 1, j = 0; i < combined.length(); i++) {
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) j = lps[j - 1];
            if (combined.charAt(i) == combined.charAt(j)) j++;
            lps[i] = j;
        }
        return rev.substring(0, s.length() - lps[combined.length() - 1]) + s;
    }
}

