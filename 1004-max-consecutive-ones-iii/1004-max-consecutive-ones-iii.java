class Solution {
    public int longestOnes(int[] nums, int k) {

        int start = 0 ; 

        int ZeroCount = 0 ; 
        int maxCount = 0 ;

        for(int end = 0 ; end < nums.length ; end++){

            if(nums[end] == 0){
                ZeroCount++;

            }
            while(ZeroCount> k){
                if(nums[start] == 0){
                    ZeroCount--;

                }
                start++;

            }
        

        maxCount = Math.max(maxCount , end - start +1);
        }
        return maxCount ;
    }
    
}
        