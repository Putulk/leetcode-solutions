class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int revPair = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((long) nums[i] > 2L * nums[j]){
                    revPair++;
                }
            }
        }
        return revPair;
    }
}