class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            sum += nums[i];
            int freq = nums[i]-k;
            if(map.containsKey(freq)){
                cnt += map.get(freq);
            }else{
                map.put(sum, map.getOrDefault(freq,0)+1);
            }
        }
        return cnt;
    }
}