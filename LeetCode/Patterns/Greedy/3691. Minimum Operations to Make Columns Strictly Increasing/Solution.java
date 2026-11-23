class Solution {
    public int minimumOperations(int[][] grid) {
        int operations=0;
        int rows=grid.length;
        int cols=grid[0].length;
        for (int j = 0; j < cols; j++) {
        for(int i=1;i<rows;i++){
            if(grid[i][j]<=grid[i-1][j]){
                int newvalue=grid[i-1][j]+1;
                operations+=newvalue-grid[i][j];
                grid[i][j]=newvalue;

            }
        }
        }
        return operations;
        
    }
}