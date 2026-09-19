class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        start = -1; end = -1;

        for(int i=0; i<n; i++){
            if
            sum = sum + nums[i];
            if(sum > maxSum){
                maxSum = sum;
                start

            }
        }
        return maxSum;
    }
}