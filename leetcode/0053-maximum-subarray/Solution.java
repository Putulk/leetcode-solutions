class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        int res = nums[0];

        for(int i=0; i<n; i++){
            if(maxSum < 0){
                maxSum = 0;
            }
            maxSum += nums[i];
            res = Math.max(res, maxSum);
        }
        return res;
    }
}