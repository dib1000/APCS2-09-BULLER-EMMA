import java.util.*;

public class MazeGenerator {
  public static void generate(char[][]maze,int startrow, int startcol) {
    maze[startrow][startcol] = ' ';
    ArrayList<String> direction = new ArrayList<String>(Arrays.asList(new String[]{"N","S","W","E"}));
    for(int i = 0; i<4; i++) {
      int newRow = startrow;
      int newCol = startcol;
      Random ran = new Random();
      int index = ran.nextInt(direction.size());
      String d = direction.get(index);
      if(d.equals("N")) {
        newRow+=1;
      }
      else if(d.equals("S")) {
        newRow-=1;
      }
      else if(d.equals("E")) {
        newCol+=1;
      }
      else {
        newCol-=1;
      }
      direction.remove(index);
      if(isBorder(maze,newRow,newCol)) {
        System.out.println(newRow + " " + newCol);
      }
    }
  }
  public static boolean isBorder(char[][] maze, int row, int col) {
    return (row>0 && row<maze.length-1) && (col>0 && col<maze[0].length-1);
   }

   private static boolean safeSquare(char[][] maze, int row, int col) {
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
