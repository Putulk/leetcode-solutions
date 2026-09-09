class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int front = 1;
            int end = 1;

        for(int i=0; i<n; i++){
            if(front == 0){
                front = 1;
                
            }
            if(end == 0){
                end = 1;
            }
            front = front*nums[i];
            end = end*nums[n-i-1];
        }
        max = Math.max(front, end);
        return max;
    }
}