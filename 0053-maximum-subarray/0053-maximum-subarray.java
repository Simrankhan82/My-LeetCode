class Solution {
    public int maxSubArray(int[] nums) {

        int CurrentSum = 0 ; 

        int maxSum = Integer.MIN_VALUE ;

        for(int i = 0 ; i < nums.length ; i++){
            if(CurrentSum < 0){
                CurrentSum = 0 ;   
            }
            CurrentSum += nums[i];
            maxSum = Math.max(maxSum , CurrentSum);
        }
        return maxSum ;
    }
}


