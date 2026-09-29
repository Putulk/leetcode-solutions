class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
      int m = matrix[0].length;

      int left = 0;
      int right = m-1;

      while(left < n && right >= 0){
        int curr = matrix[left][right];

        if(curr == target){
            return true;
        }
        else if(curr < target){
            left++;
        }else{
            right--;
        }
      }
      return false;
    }
}