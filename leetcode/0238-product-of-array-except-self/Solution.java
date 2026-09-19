class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        int left = 1; 
        int right = 1;

        for(int i=0; i<nums.length; i++){
            temp[i] = left;
            left *= nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            temp[i] *= right;
            right *= nums[i];
        }
        return temp;
    }
}