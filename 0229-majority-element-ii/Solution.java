class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        List<Integer> ans = new ArrayList<>();
        int cnt1=0, cnt2=0;
        int ele1=Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
    
        for(int i=0; i<n; i++){
            if(cnt1==0 && nums[i] != ele2){
                cnt1 = 1;
                ele1 = nums[i];
            }else if(cnt2==0 && nums[i] != ele1){
                cnt2 = 1;
                ele2 = nums[i];
            }else if(ele1 == nums[i]){
                cnt1++;
            }else if(ele2 == nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        int count1=0, count2=0;
        for (int num : nums) {
            if (num == ele1) count1++;
            else if (num == ele2) count2++;
        }

        if (count1 > nums.length / 3) ans.add(ele1);
        if (count2 > nums.length / 3) ans.add(ele2);
        return ans;
    }
}