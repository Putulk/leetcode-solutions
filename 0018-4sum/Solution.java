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
                
            }
            

        }
        return new ArrayList<>(ans);
    }
}