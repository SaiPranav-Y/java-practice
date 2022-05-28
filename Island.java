public class Island {
    
    public void dfs(int i,int j,int r,int c, char[][] grid, int vis[][]){
        if((i>=r || j>=c || i<0 || j<0 ) || (vis[i][j]==1) || grid[i][j] == '1'){
            return;
        }
            vis[i][j] = 1;
            dfs(i-1,j,r,c,grid,vis);
            dfs(i, j+1, r, c, grid, vis);
            dfs(i+1, j, r, c, grid, vis);
            dfs(i, j-1, r, c, grid, vis);
    }

    public int numIslands(char[][] grid){
        int r = grid.length;
        int c = grid[0].length;
        int vis[][] = new int [r][c];
        int count = 0;
        for(int i=0;i<r;++i){
            for(int j=0;j<c;++j){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    dfs(i,j,r,c,grid,vis);
                    count++;
                }
            }
        }
        
        return count;
    }
}

/*
 * 
 * class Solution {
 * public void dfs(int i,int j,int r,int c,char grid[][]){
 * if(i>=r || j>=c || i<0 || j<0 || grid[i][j]!='1')
 * return;
 * grid[i][j]='#';
 * dfs(i-1,j,r,c,grid);
 * dfs(i,j+1,r,c,grid);
 * dfs(i+1,j,r,c,grid);
 * dfs(i,j-1,r,c,grid);
 * }
 * public int numIslands(char[][] grid) {
 * int r=grid.length;
 * int c=grid[0].length;
 * 
 * int count=0;
 * for(int i=0;i<r;++i){
 * for(int j=0;j<c;++j){
 * if(grid[i][j]=='1')
 * {
 * dfs(i,j,r,c,grid);
 * count++;
 * }
 * }
 * }
 * return count;
 * }
 * }
 */
