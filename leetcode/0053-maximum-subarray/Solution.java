class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        start = -1; end = -1;

        for(int i=0; i<n; i++){
            if(maxSum < 0){
                maxSum = 0;
            }
            maxSum += nums[i];
            res = Math.max(r)
        }
        return maxSum;
    }
}