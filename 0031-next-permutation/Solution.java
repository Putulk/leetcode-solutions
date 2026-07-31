class Solution {
    public void nextPermutation(int[] nums) {
        int piv = -1;

        // Step 1: Find pivot
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                piv = i;
                break;
            }
        }

        // Step 2: If no pivot exists, reverse the whole array
        if (piv == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 3: Find the next greater element
        for (int i = nums.length - 1; i > piv; i--) {
            if (nums[i] > nums[piv]) {
                swap(nums, i, piv);
                bre        }

        // Step 4: Reverse the suffix
        reverse(nums, piv + 1, nums.length - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}