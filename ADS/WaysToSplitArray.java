public class WaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0, leftSum = 0;
        for (int num : nums) totalSum += num;
        
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            if (leftSum >= totalSum - leftSum) count++;
        }
        return count;
    }
}   
