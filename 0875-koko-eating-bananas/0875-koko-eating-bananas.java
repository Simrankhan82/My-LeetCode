class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 1 ; 
         int high = 0 ;
         
         for(int pile : piles ){

            high = Math.max(high , pile) ;
         }
         while(l <= high){
            int mid = l+(high-l)/2;

            long Hours = 0 ;

            for(int pile : piles){
                Hours += (pile + mid -1)/ mid ;

            }
            if(Hours <= h){
                high = mid -1 ;
            }
            else{
                l = mid + 1;


            }
         }
         return l ;
    }
}

