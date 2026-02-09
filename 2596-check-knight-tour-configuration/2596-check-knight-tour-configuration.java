class Solution {
    int[][] pos;
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        int n=grid.length;
        pos=new int[n*n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val=grid[i][j];
                pos[val][0]=i;
                pos[val][1]=j;
            }
        }
        
        return helper(0,n*n);

    }
    public boolean helper(int move,int totalMove){
        if(move == totalMove-1){
            return true;
        }

        int r1= pos[move][0];
        int c1=pos[move][1];

        int r2=pos[move+1][0];
        int c2=pos[move+1][1];

        if((Math.abs(r1-r2)==2 &&Math.abs(c1-c2)==1) || (Math.abs(r1-r2)==1 &&Math.abs(c1-c2)==2)){
            return helper(move+1,totalMove);
        }
        return false;

    }
}