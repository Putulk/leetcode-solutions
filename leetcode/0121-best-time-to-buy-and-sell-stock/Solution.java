class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
       

        for(int i=1; i<n; i++){
            int sell = prices[i] - buy;
            if(sell > profit){
                profit = sell;
            }
            buy = prices[i];
        }
        return profit;
    }
}