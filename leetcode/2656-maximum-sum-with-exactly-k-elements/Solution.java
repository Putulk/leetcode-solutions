class Solution {
    public int maximizeSum(int[] nums, int k) {
        int l = 0; 
        int r = k-1;;

        int sum = 0;
        int maxSum = 0;

        for(int i=0; i<r; i++){
            sum = sum+nums[i];
        }
        while(r<nums.length-){
            sum = sum-nums[l];
            l++;
            r++;
            maxSum = sum+nums[r];

            maxSum = Math.max(maxSum, sum);

        }
        return maxSum;
        
    }
}