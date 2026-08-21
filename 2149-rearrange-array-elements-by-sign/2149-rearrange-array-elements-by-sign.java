class Solution {
    public int[] rearrangeArray(int[] nums) {


        int[] ans = new int[nums.length];


        int pos = 0 ; 
        int neg= 1 ;

        int left = 0 ;


        for(int right = 0 ; right < nums.length ;right++){

            if(nums[right] > 0){
             ans[pos] = nums[right];
              pos += 2 ;
            }
            if(nums[right] < 0){
                ans[neg] = nums[right];
                neg += 2;


            }
        }
        return ans ;
    }
}
               

