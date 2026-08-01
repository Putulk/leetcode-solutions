class Solution {
    public int longestConsecutive(int[] nums) {
     
        int longest = 1;

        if(n==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int st : set){
            if(!(set.contains(st-1))){
                int cnt=1; 
                int curr = st;

                while(set.contains(curr+1)){
                    curr = curr+1;
                    cnt = cnt+1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}