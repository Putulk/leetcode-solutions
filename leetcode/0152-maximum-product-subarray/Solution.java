class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = ;

        for(int i=0; i<n; i++){
            int prod = 1;
            prod = prod*nums[i];
            if(prod > max){
                max = prod;
            }
        }
        return max;
    }
}