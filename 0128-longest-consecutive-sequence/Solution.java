class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest = 1;

        if(n==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int st : set){
            if()
            while(linearSearch(nums, curr+1) == true){
                curr += 1;
                cnt+=1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}