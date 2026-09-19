class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int maxSum = sum+nums[i];

            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}