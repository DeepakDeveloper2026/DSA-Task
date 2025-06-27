class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int extra=0;
        boolean check[]= new boolean[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(check[grid[i][j]]) extra=grid[i][j];
                else check[grid[i][j]]=true;
            }
        }
        for(int i=1;i<check.length;i++) if(!check[i]) return new int[]{extra,i};
        return null;
    }
}