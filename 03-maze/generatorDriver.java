
public class generatorDriver {
  public static void main(String[] args) {
    char[][] maze = new char[50][50];
    for(int i = 0; i<maze.length; i++) {
      for(int j = 0; j<maze[0].length; j++) {
        maze[i][j] = '#';
      }
    }
    //System.out.println(MazeGenerator.isBorder(maze,10,10))
    MazeGenerator.generate(maze,maze.length,maze[0].length,2,2);
    System.out.println(MazeGenerator.toString(maze));
  }
}
