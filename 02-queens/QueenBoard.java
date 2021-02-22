public class QueenBoard {
  private int[][] board;
  public QueenBoard(int size) {
    board = new int[size][size];
  }

  public String toString() {
    String stringBoard = "";
    for(int i = 0; i<board.length; i++) {
      for(int j = 0; j<board.length; j++) {
        if(board[i][j]>=0) {
          //is it a queen;
          stringBoard = stringBoard + "_ ";
        }
        else {
          //if so do this;
          stringBoard = stringBoard + "Q ";
        }
      }
      stringBoard = stringBoard + "\n";
    }
    return stringBoard;
  }

  private boolean addQueen(int r, int c) {
    //check if queen is already there OR if it's a dangerous spot
    if(board[r][c]<=0) {
      board[r][c] = -1; //queen value;
      for(int i = 1; i<board.length; i++) {
        int rAdd = r+i;
        int rSub = r-i;
        int cAdd = c+i;
        int cSub = c-i;
        if(rAdd<board.length) {
          board[rAdd][c] += 1;
          if(cAdd<board.length) {
            board[rAdd][cAdd] += 1;
          }
          if(cSub>=0) {
            board[rAdd][cSub] += 1;
          }
        }
        if(rSub>=0) {
          board[rSub][c] += 1;
          if(cAdd<board.length) {
            board[rSub][cAdd] += 1;
          }
          if(cSub>=0) {
            board[rSub][cSub] += 1;
          }
        }
        if(cAdd<board.length) {
          board[r][cAdd]+=1;
        }
        if(cSub>=0) {
          board[r][cSub]+=1;
        }
      }
      return true;
    }
    return false;
  }

  private void removeQueen(int r, int c) {
    if(board[r][c]==-1) {
      board[r][c]= 0;
      for(int i = 1; i<board.length; i++) {
        int rAdd = r+i;
        int rSub = r-i;
        int cAdd = c+i;
        int cSub = c-i;
        if(rAdd<board.length) {
          board[rAdd][c] -= 1;
          if(cAdd<board.length) {
            board[rAdd][cAdd] -= 1;
          }
          if(cSub>=0) {
            board[rAdd][cSub] -= 1;
          }
        }
        if(rSub>=0) {
          board[rSub][c] -= 1;
          if(cAdd<board.length) {
            board[rSub][cAdd] -= 1;
          }
          if(cSub>=0) {
            board[rSub][cSub] -= 1;
          }
        }
        if(cAdd<board.length) {
          board[r][cAdd]-= 1;
        }
        if(cSub>=0) {
          board[r][cSub]-= 1;
        }
      }
    }
  }

  private boolean checkClear() {
    for(int r = 0; r<board.length; r++) {
      for(int c = 0; c<board.length; c++) {
        if(board[r][c]!=0) {
          return false;
        }
      }
    }
    return true;
  }

}
