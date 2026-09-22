class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return Atmost(nums , k) - Atmost(nums,k-1);     
    }

    public int Atmost(int[] nums , int k ){
        if(k <0){
            return 0 ;
        }

        int left = 0 ;
        int oddCount = 0 ; 
        int count = 0 ;

        for(int right = 0 ; right< nums.length ; right++){

            if(nums[right] % 2 == 1){
                oddCount++;

            }

            while(oddCount > k ){
                if(nums[left]%2 == 1 ){
                    oddCount--;

                }
                left++;

            }
            count += right -left+1;
        }

        return count ;

    }
}