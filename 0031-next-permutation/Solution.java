class Solution {
    public void nextPermutation(int[] nums) {
        int piv = -1; 
        for(int i=n-1; i>piv; i--){
            if(nums[i]<nums[i+1]){
                piv = i;
                break;
            }
        }
        if(piv == -1){
            Collections.reverse(Arrays.asList(nums)); 
        }
        int i = piv+1;
        int j = n-1;

        while(i<j){
            if(nums[i]<nums[i+1]){
                
            }
        }
    }
}