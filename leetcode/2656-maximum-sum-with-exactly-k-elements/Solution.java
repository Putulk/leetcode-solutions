class Solution {
    public int maximizeSum(int[] nums, int k) {
        int l = 0; 
        int r = k-1;;

        int sum = 0;
        while(r<nums.length-1){
            sum = sum-nums[l];
            l++;
            r++;
            maxSum = sum+nums[r];

            maxSum = Math.max(maxSum, sum);

        }
        return maxSum;
        
    }
}