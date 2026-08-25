class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            int j = i+1;
            int k = n-1;
            
            // if(nums[i] > 0 && nums[i] == nums[i-1]){
            //     continue;
            // }
            while(j<k){
                if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }else if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }else{
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    inner.add(nums[k]);
                    ans.add(inner);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}