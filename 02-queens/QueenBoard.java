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
          stringBoard = stringBoard + "_ ";
        }
        else {
          stringBoard = stringBoard + "Q ";
        }
      }
      stringBoard = stringBoard + "\n";
    }
    return stringBoard;
  }
}
