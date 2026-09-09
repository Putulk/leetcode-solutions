class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int front = 1;
            int end = 1;
            if(nums[i] == 0){
                front = 1;
                end = 1;
            }else{
                prod = prod*nums[i];
                if(fr > max){
                    max = Math.max(max, prod);
                }
            }
            
        }
        return max;
    }
}