import java.util.*;
import java.io.*;
public class Tester {
  public static void main(String[] args) throws FileNotFoundException {
    Maze one = new Maze("Maze1.txt");
    System.out.println(one.toString());
    one.setAnimate(false);
    System.out.println(one.solve());
    System.out.println(one);
  }
}
