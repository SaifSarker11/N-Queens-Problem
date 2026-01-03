import java.util.ArrayList;
import java.util.List;

public class NQueens{
public boolean isSafe(int row, int col, char[][] board){

    for (char[] board1 : board) {
        if (board1[col] == 'Q') {
            return false;
        }
    }
    
    for(int j = 0; j < board.length; j++){
        if(board[row][j] == 'Q'){
            return false;
        }
    }
    
    int r = row;
    for(int c = col; c >= 0 && r >= 0; c--, r--){
        if(board[r][c] == 'Q'){
           return false;
        }
    }
    
    r = row;
    for(int c = col; c < board.length && r >= 0; c++, r--){
        if(board[r][c] == 'Q'){
            return false;
        }
    }
    
    r = row;
    for(int c = col; c >= 0 && r < board.length; c --, r++){
        if(board[r][c] == 'Q'){
            return false;
        }
    }
    
    r = row;
    for(int c = col; c < board.length && r < board.length; c++, r++){
        if(board[r][c] == 'Q'){
            return false;
        }
    }
    return true;
  }

public void saveBoard(char[][] board, List<List<String>> allBoards){
    List<String> newBoard = new ArrayList<>();
    for (char[] board1 : board) {
        String row = " ";
        for (int j = 0; j < board1.length; j++) {
            if (board1[j] == 'Q') {
                row += "Q";
            } else {
                row += ".";
            }
        }
        newBoard.add(row);
    }
    allBoards.add(newBoard);
}

public void helper(char[][] board, List<List<String>> allBoards, int col){
if(col == board.length){
    saveBoard(board, allBoards);
    return;
}
for(int row = 0; row < board.length; row++){
    if(isSafe(row, col, board)){
        board[row][col] = 'Q';
        helper(board, allBoards, col + 1);
        board[row][col] = '.';
    }
  }
}

public List<List<String>> solveNQueens(int n){
    char[][] board = new char[n][n];
    List<List<String>> allBoards = new ArrayList<>();
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            board[i][j] = '.';
        }
    }
    helper(board, allBoards, 0);
    return allBoards;
}

public static void main(String args[]){
    NQueens sol = new NQueens();
    int n = 4;
    List<List<String>> solutions = sol.solveNQueens(n);

    for(List<String> solution : solutions){
       for(String row : solution){
        System.out.println(row);
       }
       System.out.println();
     }
  }
}
