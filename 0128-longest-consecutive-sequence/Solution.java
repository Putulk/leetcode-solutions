class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest = 1;
        for(int i=0; i<n; i++){
            int curr = nums[i];
            int cnt =1;
            while(linearSearch(nums, curr+1) == true){
                curr += 1;
                cnt+=1;
            }
            longest
        }
    }

    private boolean linearSearch(int[] nums, int num){
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == num){
                return true;
            }
        }
        return false;
    }
}