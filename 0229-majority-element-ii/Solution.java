class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int maj1=0, maj2=0;
        int cnt1=0, cnt2=0;
        for(int i=0; i<n; i++){
            if(cont1==0 && nums[i] != maj2){
                cnt1=1;
                maj1=nums[i];
            }
            else if(cn2==0 && nums[i] != maj1){
                cnt2=1;
                maj2=nums[i];
            }
            else if(nums[i] == maj2){
                cnt2++;
            }
            else if(nums[i] == maj1){
                
            }
        }
    }
}