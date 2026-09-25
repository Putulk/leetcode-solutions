class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n = nums.length;
        int m = 0;
        int score = 0;
        for(int num: nums){
            m = Math.max(m, num);
        }
        return score;
        
    }
}