class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        List<Integer> list

        while(left <= right){
            int mid = left +(right-left)/2;

            if(nums[mid] == target){
                ans[0] = mid;
                left = mid+1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
}