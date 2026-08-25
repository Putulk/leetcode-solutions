class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n= nums.length;
        int k = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                nums[k] = -(nums[i]+nums[j]);
                List<Integer> innerList = new ArrayList<>();
                if(set.contains(nums[k])){
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(nums[k]);
                    ans.add(innerList);
                    return ans;
                }else{
                    set.add(nums[j]);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}