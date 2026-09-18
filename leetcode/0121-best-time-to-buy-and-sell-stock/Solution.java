class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int currPrice = prices[0];

        for(int i=1; i<n; i++){
            int sell = prices[i] - currPrice;
            if(prices[i] < currPrice){
                cu
            }
            profit = sell;
        }
        return profit;
    }
}