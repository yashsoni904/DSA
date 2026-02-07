class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(0 ,0, board );
    }
    public boolean backtrack(int row ,int col, char[][] board ){
         if(row==9 ) return true;

         if(col==9){
             return backtrack(row+1,0,board);
         }
         if(board[row][col]!='.'){
            return backtrack(row,col+1,board);
         }

         for(char num='1';num<='9' ; num++){
              
                  if(isSafe(row,col,board,num)){
                      board[row][col]=num;
                      if(backtrack(row,col+1,board)){
                         return true;
                      }
                      board[row][col]='.';
                  }
              
             
         }
         return false;
    }
    public boolean isSafe(int row ,int col,char[][] board ,char num){
        //check row
        for(int i=0;i<9;i++){
            if(board[row][i]==num) return false;
        }
        //check column
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        //check into 3x3 grid
        int newrow=(row/3)*3;
        int newcol=(col/3)*3;
        for(int i=newrow;i<newrow+3;i++){
            for(int j=newcol;j<newcol+3;j++){
               if(board[i][j]==num) return false; 
            }
        }
        return true;
    }
}