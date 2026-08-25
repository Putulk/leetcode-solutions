class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n= nums.length;
        int k = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int thirdElement = -(nums[i]+nums[j]);
                List<Integer> innerList = new ArrayList<>();
                if(set.contains(thirdElement) {
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(thirdElement);
                    Collections.sort(innerList);
                    ans.add(innerList);
                }
                set.add(nums[j]);
            }
        }
        return ans;
    }
}