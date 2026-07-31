class Solution {
    public void nextPermutation(int[] nums) {
        int piv = -1; 
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                piv = i;
                break;
            }
        }
        if(piv == -1){
            for (int i = 0; i < nums.length / ; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        }
        int i = piv+1;
        int j = nums.length-1;

        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}