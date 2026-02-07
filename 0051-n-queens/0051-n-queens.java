class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans= new ArrayList<>();
        char[][] board =new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(0 , board , ans);
        return ans;
    }
    public void backtrack(int row , char[][] board , List<List<String>> ans){
        if(row==board.length){
            ans.add(create(board));
            return;
        }
        for(int col=0;col<board.length;col++){
           if(isSafe(row, col,board)){
              board[row][col]='Q';
              backtrack(row+1 , board , ans);
              board[row][col]='.';
           }

        }   
    }
    public boolean isSafe(int row ,int col,char[][] board){
        //check column
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        //check left diagonal
        for(int i=row-1,j=col-1; i>=0 && j>=0 ; i--,j--){
             if(board[i][j]=='Q') return false;
        }
        //check right diagonal
        for(int i=row-1,j=col+1 ; i>=0 && j<board.length ; i-- , j++){
              if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public List<String> create(char[][] board){
        List<String> list = new ArrayList<>();
        for(char[] c : board){
            list.add(new String(c));
        }
        return list;
    }
}