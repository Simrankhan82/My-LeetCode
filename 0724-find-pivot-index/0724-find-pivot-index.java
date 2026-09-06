class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){

            totalSum += nums[i];

        } 

        int left = 0 ; 
        int right = 0; 
        for(int i = 0 ; i < nums.length ; i++) {

           
            right = totalSum - nums[i] - left;

            if(right == left){
                return i ;
            }

            left += nums[i] ;

        }
        return -1 ;
    }
}

