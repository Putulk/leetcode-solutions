class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0; i<n; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int thirdElement = -(nums[i]+nums[j]);
                if(set.contains(thirdElement)){
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(thirdElement);
                    Collections.sort(innerList);
                    ans.add(innerList);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}