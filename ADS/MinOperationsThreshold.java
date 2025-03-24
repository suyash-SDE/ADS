import java.util.*;

public class MinOperationsThreshold {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0, sum = 0;

        for (int num : nums) {
            sum += num;
            count++;
            if (sum >= k) return count;
        }
        return -1;
    }
}

