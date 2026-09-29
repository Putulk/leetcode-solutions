class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = (m*n)-1;

        while(left <= right){
            int mid = left+(right-left)/2;

            int row = mid/m;
            int col = mid%m;
            int val = matrix[row][col];

            if(val == target){
                rtrue;
            }else if(val < target){
                n = mid+1;
            }else{
                m = mid-1;
            }

        }
        return false;

    }
}