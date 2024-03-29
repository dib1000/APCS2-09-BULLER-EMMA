
import java.util.*;
import java.io.*;
public class Maze {
private char[][] maze;
private boolean animate;
public Maze(String filename) throws FileNotFoundException {
  animate = false;
  File text = new File(filename);
  Scanner data = new Scanner(text);
  ArrayList<char[]> storage = new ArrayList<char[]>();
  while(data.hasNextLine()) {
    String line = data.nextLine();
    storage.add(line.toCharArray());
  }
  maze = new char[storage.size()][storage.get(0).length];
  for(int i = 0; i<maze.length; i++) {
    maze[i] = storage.get(i);
  }
}

private void wait(int millis){
  try {
    Thread.sleep(millis);
  }
    catch (InterruptedException e) {
  }
}

public void setAnimate(boolean b){
    animate = b;
}

public static void clearTerminal(){
  //erase terminal
  System.out.println("\033[2J");
}
public static void gotoTop(){
  //go to top left of screen
  System.out.println("\033[1;1H");
}

public String toString() {
  String ezam = "";
  for(int i = 0; i<maze.length; i++) {
    char[] chars = maze[i];
    for(int j = 0; j<chars.length; j++) {
      ezam = ezam + chars[j];
    }
    ezam = ezam + "\n";
  }
  return ezam;
}

public int solve() {
  if(animate) {
    clearTerminal();
  }
  for(int i = 0; i<maze.length; i++) {
    for(int j = 0; j<maze[0].length; j++) {
      if(maze[i][j]=='S') {
        return solve(i,j,0);
      }
    }
  }
  return -10;
}

private int solve(int row, int col, int steps) {
  if(animate) {
    gotoTop();
    System.out.println(this);
    wait(50);
  }
  if(maze[row][col]=='E') {
    return steps;
  }
  if(maze[row][col]=='.' || maze[row][col]=='#' || maze[row][col]=='@') {
    return -1;
  }
  if(maze[row][col]=='S' || maze[row][col]==' ') {
    maze[row][col] = '@';
    int val = solve(row+1,col,steps+1);
    if(val!=-1) {
      return val;
    }
    val = solve(row-1,col,steps+1);
    if(val!=-1) {
      return val;
    }
    val = solve(row,col+1,steps+1);
    if(val!=-1) {
      return val;
    }
    val = solve(row,col-1,steps+1);
    if(val!=-1) {
      return val;
    }
    maze[row][col] = '.';
    return -1;
  }
  return steps;
}
}
