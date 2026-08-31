class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        A
        for(int i=0; i<m; i++){
            nums[i] = nums1[i];
        }
        for(int i=m; i<nums.length; i++){
            nums[i] = nums2[i-m];
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            nums1[i]=nums[i];
        }
    }
}