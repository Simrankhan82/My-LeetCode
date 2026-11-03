class Solution {
    public int maxSubArray(int[] nums) {

        int CurrentSum = nums[0] ;
        int maxSum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){

            CurrentSum = Math.max(nums[i] , CurrentSum + nums[i]);

        
            maxSum = Math.max(maxSum , CurrentSum );
        }
        return maxSum ;
    }
}

