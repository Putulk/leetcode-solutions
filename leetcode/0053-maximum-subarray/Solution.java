class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int r

        for(int i=0; i<n; i++){
            if(maxSum < 0){
                maxSum = 0;
            }
            maxSum += nums[i];
            res = Math.max(res, maxSum)
        }
        return res;
    }
}