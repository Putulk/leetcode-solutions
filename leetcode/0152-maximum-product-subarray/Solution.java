class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int front = 1;
            int end = 1;
            if(front == 0){
                front = 1;
                
            }
            if(end == 0){
                end = 1;
            }
            front = front*nums[i];
            end = end*n
        }
        return max;
    }
}