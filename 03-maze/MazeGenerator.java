import java.util.*;

public class MazeGenerator {
  public static void generate(char[][]maze,int startrow, int startcol) {
    maze[startrow][startcol] = ' ';
    ArrayList<String> direction = new ArrayList<String>(Arrays.asList(new String[]{"N","S","W","E"}));
    
  }
  private boolean isBorder(char[][] maze, int row, int col) {
    return (row!=0 && row!=maze.length) && (col!=0 && row!=maze.length);
   }

   private boolean safeSquare(char[][] maze, int row, int col) {
     int counter = 0;
     if(maze[row+1][col]==' ') {
       counter+=1;
     }
     if(maze[row-1][col]==' ') {
       counter+=1;
     }
     if(maze[row][col+1]==' ') {
       counter+=1;
     }
     if(maze[row][col-1]==' ') {
       counter+=1;
     }
     return counter<2;
   }
}
