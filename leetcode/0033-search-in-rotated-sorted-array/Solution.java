class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int left = 0;
        int right = n-1;
        int ans = -1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                ans = mid;
            }else if(nums[left] <= nums[mid]){
                if(nums[l])
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
}