class Solution {
    public int totalNQueens(int n) {  //b->board
        char[][] b =new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(b[i],'.');
        }
        int[] count={0};
        backtrack(0 , b ,count);
        return count[0];
    }
    public void backtrack(int row , char[][] b , int[] count ){
        if(row == b.length){
            count[0]++;
            return;
        }
        for(int col=0;col<b.length;col++){
            if(isSafe(row,col,b)){
                 b[row][col]='Q';
                 backtrack(row+1 , b ,count);
                 b[row][col]='.';
            }
        }
    }
    public boolean isSafe(int row , int col , char[][] b) {
        for(int i=0;i<row;i++){
            if(b[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1 ; i>=0 && j>=0 ; i--, j--){
            if(b[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1 ; i>=0 && j<b.length ; i--, j++){
            if(b[i][j]=='Q') return false;
        }
        return true;
    }
}