class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = 0;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(nums[mid] != nums[lef] && nums[mid] != nums[right]){
                ans = nums[mid];
                left++;
                right--;
            }
        }
        return ans;
    }
}