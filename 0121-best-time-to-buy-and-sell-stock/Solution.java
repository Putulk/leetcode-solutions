class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sellProfit = prices[j]-prices[i];
    
                if(sellProfit > profit){
                    profit= sellProfit;
                }
            }
        }
        return profit;
    }
}