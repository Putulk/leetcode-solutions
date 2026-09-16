class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = 0;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(nums[mid] != nums[left] && nums[mid] != nums[right]){
                an nums[mid];
            }else if(nums[mid] < nums[left]){
                left = mid+1; 
            }else{
                right = mid -1;
            }
        }
        return 
    }
}