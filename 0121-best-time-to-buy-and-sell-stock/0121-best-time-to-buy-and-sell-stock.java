class Solution {
    public int maxProfit(int[] prices) {


        int profit = 0 ;   
        int minPrices = prices[0] ;

        int maxProfit = 0 ; 

        for(int i = 0 ; i<prices.length ; i++){
            minPrices = Math.min(minPrices , prices[i]);


            profit = prices[i] - minPrices ;

            maxProfit = Math.max(maxProfit , profit);
        }

        return maxProfit ;

    }
}



