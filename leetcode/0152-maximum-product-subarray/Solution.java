class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int prod = ;
            if(nums[i] == 0){
                prod = 1;
            }else{
                prod = prod*nums[i];
                if(prod > max){
                    max = Math.max(max, prod);
                }
            }
            
        }
        return max;
    }
}