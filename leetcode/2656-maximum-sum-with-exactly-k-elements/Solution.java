class Solution {
    public int maximizeSum(int[] nums, int k) {
        int l = 0; 
        int r = k-1;;

        int sum = 0;

        for(int i=0; i<r)
        while(r<nums.length){
            sum = sum-nums[l];
            l++;
            r++;
            sum = sum+nums[r];


        }
        
    }
}