class Solution {
    public int maxProfit(int[] prices) {
      // if(prices.length <=1) return 0;
       int profit = 0 , i = 0; 
       int minProfit = prices[0];
       while(i < prices.length){
           profit = Math.max(profit, prices[i] - minProfit);
           minProfit = Math.min(minProfit, prices[i]);
           i++;
        }
        return profit;   
    }
}