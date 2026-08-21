class Solution {
    public int maxSubArray(int[] nums) {



      int   CurrentSum = 0 ;

      int maxSum = Integer.MIN_VALUE ; 

      for(int i =0 ; i < nums.length; i++){

        CurrentSum = Math.max(nums[i] , CurrentSum+nums[i]);

        maxSum  = Math.max(CurrentSum , maxSum);
      }

      return maxSum;


    }


}
