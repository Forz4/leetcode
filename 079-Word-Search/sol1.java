class Solution {
    public boolean exist(char[][] board, String word) {
        // looking for the first element in the board
        for ( int i = 0 ; i < board.length ; i ++ ){
            for ( int j = 0 ; j < board[i].length ; j ++){
                    if ( search(new int[board.length][board[0].length] , board , i , j , 0 , word) == 1 ) 
                        return true;
            }
        }
        return false;
    }
    private int search(int[][] been , char[][] board , int x , int y , int index , String word){
        if ( x < 0 || x >= board.length || y < 0 || y >= board[0].length || been[x][y] == 1 || word.charAt(index) != board[x][y])
            return 0;
        if ( index == word.length()-1 )
            return 1;
        been[x][y] = 1;
        if ( search(been,board,x+1,y,index+1,word) == 1 )   return 1;
        if ( search(been,board,x-1,y,index+1,word) == 1 )   return 1;
        if ( search(been,board,x,y+1,index+1,word) == 1 )   return 1;
        if ( search(been,board,x,y-1,index+1,word) == 1 )   return 1;
        been[x][y] = 0;
        return 0;
    }
}
