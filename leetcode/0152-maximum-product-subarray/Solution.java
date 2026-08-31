class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 0;

        for(int i=0; i<n; i++){
            int prod = ;
            prod = prod*nums[i];
            if(prod > max){
                max = prod;
            }
        }
        return max;
    }
}