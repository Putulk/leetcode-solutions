class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        int sum = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<n; i++){
            sum += nums[i];
            int comp = sum-k;
            if(sum == k){
                cnt++;
            }else if(map.containsKey(comp)){
                cnt += map.get(comp);
            }else{
                map.put(sum, map.getOrDefault(comp,0)+1);
            }
        }
        return cnt;
    }
}