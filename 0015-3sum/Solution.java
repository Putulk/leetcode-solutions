class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0; i<n; i++){
            int j = i+1;
            int k = n-1;
            List<Integer> inner = new ArrayList<>();
            if(nums[i] > 0 && nums[i] == nums[i-1]){
                continue;
            }
            while(j<=k){
                if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }else if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }else{
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    inner.add(nums[k]);
                    and.add(inner);
                    j++;
                    k--;
                    while(nums[j] == nums[])
                }
            }
        }
        return new ArrayList<>(ans);
    }
}