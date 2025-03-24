public class PunishmentNumber {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (isValid(String.valueOf(square), 0, i)) sum += square;
        }
        return sum;
    }

    private boolean isValid(String s, int index, int target) {
        if (index == s.length()) return target == 0;
        int num = 0;
        for (int i = index; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num > target) return false;
            if (isValid(s, i + 1, target - num)) return true;
        }
        return false;
    }
}

