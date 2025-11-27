class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int[][] ans=image;
        int oldcolor=image[sr][sc];
        dfs(image,sr,sc,color,oldcolor,drow,dcol,ans);
        return ans;
    }
    public void dfs(int[][] image, int sr, int sc, int color,int oldcolor,int[] drow,int[] dcol,int[][] ans){
        ans[sr][sc]=color;
        int m=image.length;
        int n=image[0].length;
        for(int i=0;i<4;i++){
            int nr=sr+drow[i];
            int nc=sc+dcol[i];
            if(nr>=0 && nr<m && nc>=0 && nc<n && image[nr][nc]==oldcolor && ans[nr][nc]!=color){
                dfs(image,nr,nc,color,oldcolor,drow,dcol,ans);
            }
        }
    }
}