class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            sum += nums[i];
            int freq = nums[i]-
            if(map.containsKey(nums[i]-k)){
                cnt += map.get()
            }
        }
        return cnt;
    }
}