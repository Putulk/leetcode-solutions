class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            
            sum += nums[i];
            if(sum == k){
                cnt++;
            }else if(map.containsKey(k-nums[i])){

            }
        }
        return cnt;
    }
}