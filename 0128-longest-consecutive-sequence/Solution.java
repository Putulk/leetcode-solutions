class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest = 1;

        if(n==0){
            return 0;
        }
        for(int i=0; i<n; i++){
            int curr = nums[i];
            int cnt =1;
            while(linearSearch(nums, curr+1) == true){
                curr += 1;
                cnt+=1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}