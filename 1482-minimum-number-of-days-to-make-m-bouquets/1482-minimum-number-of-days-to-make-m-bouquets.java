class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

            if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find the minimum and maximum bloom day
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans= 0 ; 

        // Binary Search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid )) {
                ans = mid ;
                high= mid - 1 ;    // Try a smaller day
            } else {
                low = mid + 1;   // Need more days
            }
        }

        return ans ;
    }

    // Check if we can make at least m bouquets in  days
    private boolean canMake(int[] bloomDay, int m, int k, int days) {

        int flower = 0 ; 
        int bouquent = 0 ; 

        for(int bloom : bloomDay){

            if(bloom <= days){
                flower++;
                if(flower == k){
                    bouquent++; // adding the boquet and initialise the flower = 0 
                    flower = 0 ;
                }  
            }else{
                    flower = 0 ; // the chain get broken 

                }
        }

            return bouquent >= m ;  // then it will return the bouquet 



        
    }
}

