public class SumAbsoluteDifferences {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length, leftSum = 0, rightSum = 0;
        for (int num : nums) rightSum += num;
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            result[i] = nums[i] * i - leftSum + rightSum - nums[i] * (n - 1 - i);
            leftSum += nums[i];
        }
        return result;
    }
}
