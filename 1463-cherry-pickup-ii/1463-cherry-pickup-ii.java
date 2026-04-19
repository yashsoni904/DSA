class Solution {
    int rows;
    int cols;
    Integer[][][] dp;

    public int cherryPickup(int[][] grid) {
        rows=grid.length;
        cols=grid[0].length;
        dp =new Integer[rows][cols][cols];
        return solve(0,0,cols-1,grid);
    }

    public int solve(int r ,int c1,int c2,int[][] grid){

        if(c1<0 || c2<0 || c1>=cols || c2>=cols){
            return Integer.MIN_VALUE;
        }

        if(r==rows-1){
            if(c1==c2) return grid[r][c1];
            else{
                return grid[r][c1]+grid[r][c2];
            }
        }

        if(dp[r][c1][c2]!=null) return dp[r][c1][c2];

        int cherry;

        if(c1==c2) cherry=grid[r][c1];
        else cherry= grid[r][c1]+grid[r][c2];

        int max=Integer.MIN_VALUE;
        
        for(int d1=-1;d1<=1;d1++){
            for(int d2=-1;d2<=1;d2++){
                int step = solve(r+1,c1+d1,c2+d2,grid);

                max = Math.max(max , step);
            }
        }
        return dp[r][c1][c2]= max+cherry;

    }
}