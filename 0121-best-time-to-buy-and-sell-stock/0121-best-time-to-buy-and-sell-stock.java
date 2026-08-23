class Solution {
    public int maxProfit(int[] prices) {

        int minPrices = Integer.MAX_VALUE;

        int maxProfit = 0 ;
         for(int i = 0; i < prices.length ; i++){

            minPrices = Math.min(minPrices , prices[i]);


            maxProfit = Math.max(maxProfit , prices[i] - minPrices);
         }
         return maxProfit ;
    }
   
}




