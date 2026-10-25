class Solution {
    public int findTargetSumWays(int[] nums, int target) {  
       return  Target(nums  ,0 , 0 , target); 
    }


    public int  Target(int [] nums , int index  , int sum , int target ){

        if(index == nums.length){

            if(sum == target){

                return 1;
            }
            return 0 ;
        }

      int  plus = Target(nums , index+1 ,sum+nums[index] , target );
      int  minus = Target(nums ,  index+1 , sum-nums[index] ,target);

        return  plus+ minus ;


    } 
}

        
   