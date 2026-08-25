class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n= nums.length;
        int k = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int nums[k] = (nums[i]+nums[j]);
                List<Integer> innerList = new ArrayList<>();
                if(map.containsKey(nums[k])){
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(nums[k]);
                    ans.add(innerList);
                    return and;
                }else{
                    map.put(nums[k], )
                }
            }
        }
    }
}