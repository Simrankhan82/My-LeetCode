class Solution {

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        // Find search space
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        // Binary Search
        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {

        int count = 1;
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num > maxSum) {
                count++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }

        return count <= k;
    }
}