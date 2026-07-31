class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0, neg=1;
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                ans[p]=nums[i];
                p+=2;
            }
            else{
                ans[n]=nums[i];
                n=n+2;
            }
        }

        return ans;
    }
}