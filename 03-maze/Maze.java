import java.util.*;
import java.io.*;
public class Maze {
  private char[][] maze;
  private boolean animate;
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
}
