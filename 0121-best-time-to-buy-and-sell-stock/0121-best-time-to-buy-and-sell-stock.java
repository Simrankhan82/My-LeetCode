class Solution {
    public int maxProfit(int[] prices) {

        int Profit =0 ; 
        int minPrice = prices[0] ;
        int maxProfit = 0 ; 

        for(int i = 0 ;i < prices.length ; i++){

            minPrice = Math.min(minPrice , prices[i]);
            Profit = prices[i] - minPrice ;

            maxProfit = Math.max(maxProfit, Profit);

        
        }
        return maxProfit ;
    }
}



