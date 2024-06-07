package Recursion;

public class Nqueens {
    boolean board[][];

    public int totalNQueens(int n){
        board = new boolean[n][n];
    }
    int helper(int row,int n){

        for(int col=0; col<n; col++){
            board[row][col] = true;
            helper(row+1,n);
        }
    }

    boolean willPlaceOrNot(int row,int col){
        for(int i=row; i>=0; i--){
            if(board[i][col] == true){
                return false;
            }
        }
    }
}
