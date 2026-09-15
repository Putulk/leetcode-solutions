class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(l < r){
            int m = l+(r-l)/2;

            if(nums[l] <= nums[r]){
                ans = Math.min(ans, nums[l]);
                break;
            }

            if(nums[low] <= nums[m]){
                ans = Math.min(ans, nums[low]);
            }
        }
        return nums[l];
    }
}