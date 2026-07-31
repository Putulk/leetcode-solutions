class Solution {
    public void nextPermutation(int[] nums) {
        int piv = -1; 
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                piv = i;
                break;
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

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}