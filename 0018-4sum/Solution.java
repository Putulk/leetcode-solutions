class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            int j = i+1;
            int k = n-1;
            int fourth = target -(nums[i]+nums[j]+nums[k]);
            while(j < k){
                
                int sum3 = (nums[i]+nums[j]+nums[k]);
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{

                }
            }

        }
    }
}