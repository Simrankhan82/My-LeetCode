class Solution {
    public int pivotIndex(int[] nums) {

       int leftsum = 0 ;
       int rightsum = 0 ;
       int left = 0 ;
    


        for( int i = 0 ; i < nums.length ; i++){

            rightsum += nums[i];

        } 

       while(left < nums.length ){
            rightsum-= nums[left] ;
        


        if(leftsum == rightsum){
            return left ;
        }

        leftsum += nums[left];
        left++;
       }
       return -1 ; 

    }

   

}



       