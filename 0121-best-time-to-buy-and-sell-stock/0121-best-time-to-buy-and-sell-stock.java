class Solution {
    public int maxProfit(int[] prices) {
        int BuyStock = prices[0];
        int maxProfit = 0 ;

        for(int i = 0 ; i < prices.length ; i++){

            BuyStock = Math.min(BuyStock , prices[i]);

            int currentProfit = prices[i] - BuyStock ;

            maxProfit = Math.max(maxProfit , currentProfit);

        }

        return maxProfit ;
    }
}
            
