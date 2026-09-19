class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] temp = new int[nums.length];
        int left = 1; 
        int right = 1;

        for(int i=0; i<nums.length; i++){
            temp[i] *= left;
            left *= nums[i];
        }
        System.out.println(Arrays.toString(temp)); 
        for(int i=nums.length-1; i>=0; i--){
            temp[i] *= right;
            right *= nums[i];
        }
        System.out.println(Arrays.toString(temp)); 
        return temp;
    }
}