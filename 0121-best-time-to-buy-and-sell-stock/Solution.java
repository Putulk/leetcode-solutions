class Solution {
    public int maxProfit(int[] prices) {
        int n=nums.length;
        int profit = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                sellProfit = nums[j]-nums[i];
                if(sellProfit > profit)
            }
        }
    }
}