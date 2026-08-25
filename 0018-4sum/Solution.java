class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n-1; i++){
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for(int j=i+1; j<n; j++){
                if (j > 0 && arr[i] == arr[i - 1]) continue;
                int left = i+1;
                int k = n-1;
                int fourth = target -(nums[i]+nums[j]+nums[k]);
            }
            
            while(j < k){
                int sum = (nums[i]+nums[j]+nums[k]);
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    inner.add(nums[k]);
                    inner.add(fourth);
                    ans.add(inner);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                }
            }

        }
        return new ArrayList<>(ans);
    }
}