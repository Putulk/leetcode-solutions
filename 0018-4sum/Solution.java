class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n-1; i++){
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for(int j=i+1; j<n; j++){
                if (j > i+1 && arr[j] == arr[j - 1]) continue;
                int left = j+1;
                int right = n-1;
                while(left < right){
                int sum = nums[i]+nums[j]+nums[left]+nums[right];
                if(sum < target){
                    left++;
                }else if(sum > target){
                    right--;
                }else{
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    inner.add(nums[left]);
                    inner.add(right);
                    ans.add(inner);
                    j++;
                    k--;
                    while(j<k && nums[left] == nums[left-1]) j++;
                    while(j<k && nums[k] == nums[right-1]) k--;
                }
            }

                
            }
        }
        return new ArrayList<>(ans);
    }
}