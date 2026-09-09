class Solution {
    public int[] runningSum(int[] nums) {
        int [] sum = new int[nums.length] ;
        int CurrentSum = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
     

            CurrentSum += nums[i] ;
            sum[i] = CurrentSum ;

        }

        return sum ;

    }
}



