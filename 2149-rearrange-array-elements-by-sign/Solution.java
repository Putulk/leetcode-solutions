class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int[] pos = new int[nums.length/2];
        // int[] neg = new int[nums.length/2];
        int p=0, n=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                nums[p]=nums[i];
                p=p+2;
            }
            else{
                nums[n]=nums[i];
                n=n+2;
            }
        }

        return nums;
    }
}