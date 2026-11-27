class Solution {
    public int findMiddleIndex(int[] nums) {

        int leftSum = 0 ; 
        int rightSum = 0 ; 
        int left = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            rightSum += nums[i];     
        }

        while(left < nums.length){
            rightSum -= nums[left];

 
            if(leftSum == rightSum){
                return left ;

            }

         leftSum += nums[left];
         left++;          
        } 
        return -1 ;
        
    }
}
