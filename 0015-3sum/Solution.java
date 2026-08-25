class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n= nums.length;
        int k = 0;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int nums[k] = (nums[i]+nums[j]);
                if(map.containsKey(nums[k])){

                }
            }
        }
    }
}