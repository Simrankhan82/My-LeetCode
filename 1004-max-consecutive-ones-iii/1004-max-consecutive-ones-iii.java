class Solution {
    public int longestOnes(int[] nums, int k) {

        int start = 0 ;
        int ZeroCount = 0 ; 
        int maxLen = 0 ;

        for(int end = 0 ; end < nums.length ; end ++){

            if(nums[end] == 0){
                ZeroCount++ ;

            }
            while(ZeroCount > k){
                if(nums[start] == 0){
                    ZeroCount--;
                }

                start++;

            }
          maxLen = Math.max(maxLen , end - start +1);
        }
        return maxLen ;
    }
}
        