class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int  rigth = n-1;
        int ans = n;
        
        while(left <= right){
            int mid = left +(right-left)/2;

            if(nums[mid] == target){
                ans = mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }el
        }
    }
}