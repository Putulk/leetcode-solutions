class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max = 0; 
        int min = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(prices[i] < min){
                min = peices[i];
                max = prices[i]-min;
            }
        }
        return max;
    }
}