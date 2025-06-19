class Solution {
    List<int[]> ls = new ArrayList<>();
    public void setZeroes(int[][] matrix) {
        
        int i2=0,j2=0;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0) ls.add(new int[]{i, j});
            }
        }
        helper(matrix);
    }
    public void helper(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for (int[] pos : ls) {
            int row = pos[0];
            int col = pos[1];

            // Set entire row to 0
            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }

            // Set entire column to 0
            for (int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
        }
    }
    
}