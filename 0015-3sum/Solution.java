class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0; i<n; i++){
            int j = i+1;
            int k = n-1;

            while(j<=k){
                if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }else if(n)
            }
        }
        return new ArrayList<>(ans);
    }
}