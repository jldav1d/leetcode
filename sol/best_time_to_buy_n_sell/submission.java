class Solution {
    public int maxProfit(int[] prices) {
        // as you move through the day
        // always remember the cheapest day
        int maxProfit = 0;
        int cheapestDayIdx = 0;
        for (int i = 0; i < prices.length; i++){
            if(prices[i] < prices[cheapestDayIdx]){
                cheapestDayIdx = i;
            }
            // try to sell
            int profit = prices[i] - prices[cheapestDayIdx];
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
        
    }
}