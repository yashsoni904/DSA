class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] vis=new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (backtrack(board, word, vis, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backtrack(char[][] board, String word,boolean[][] vis,int r,int c,int idx){
          if(idx==word.length()) return true;

          if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) return false;

          if (vis[r][c] || board[r][c] != word.charAt(idx))  return false;
          
          vis[r][c]=true;

          boolean found = backtrack(board,word,vis,r-1,c,idx+1) ||
                           backtrack(board,word,vis,r,c+1,idx+1) ||
                            backtrack(board,word,vis,r+1,c,idx+1) ||
                             backtrack(board,word,vis,r,c-1,idx+1) ;

          vis[r][c]=false;
          
          return found;
       
    }
}