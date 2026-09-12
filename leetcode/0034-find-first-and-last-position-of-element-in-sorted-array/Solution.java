class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1;
        int last = -1;
        int left = 0;
        int right = n-1;
        List<Integer> list = new ArrayList<>();

        while(left <= right){
            int mid = left +(right-left)/2;

            if(nums[mid] == target){
                first = 
                left = mid+1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        left = 0;
        right = n-1;
        while(left <= right){
            int mid = left +(right-left)/2;

            if(nums[mid] == target){
                list.add(mid);
                right = mid-1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        int[] ans = list.stream().mapToInt(i->i).toArray();
        return ans;
    }
}