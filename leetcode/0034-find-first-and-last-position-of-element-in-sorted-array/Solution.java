class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[2];

        while(left <= right){
            int mid = left +(right-left)/2;

            if(nums[mid] == target){
                a
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}