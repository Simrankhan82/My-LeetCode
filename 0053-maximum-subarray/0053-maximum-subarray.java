class Solution {
    public int maxSubArray(int[] nums) {


        int CurrentSum = 0 ; 
        int MaxSum = Integer.MIN_VALUE ;

        for(int i = 0 ; i < nums.length ; i++){


            CurrentSum = Math.max(nums[i] ,  CurrentSum+ nums[i]);
            MaxSum = Math.max(MaxSum  ,  CurrentSum);

        }

        return MaxSum ;

    }
}
        


