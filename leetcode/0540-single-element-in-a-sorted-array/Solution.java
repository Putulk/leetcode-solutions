class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = 0;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                ans = nums[mid];
            }else if(nums[mid] ==)
        }
        return ans;
    }
}