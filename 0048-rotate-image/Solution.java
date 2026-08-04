class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0; i<n-2; i++){
            for(int j=1; j<n-1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for()
    }
}