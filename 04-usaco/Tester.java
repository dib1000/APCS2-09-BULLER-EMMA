import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {
  public static void main(String[] args) throws FileNotFoundException {
    int[][] lake = {{28,25,20,32,34,36},{27,25,20,20,30,34},{24,20,20,20,20,30},{20,20,14,14,20,20}};
    int[][] steps = {{1,4,4},{1,1,10}};
    // USACO.stompDig(lake,1,4,4);
    // USACO.stompDig(lake,1,1,10);
    //System.out.println(USACO.bronze(lake,steps,22));
    //System.out.println(Arrays.deepToString(lake));
    System.out.println(USACO.bronze("lake1.input"));
    System.out.println(USACO.bronze("lake2.input"));
    System.out.println();

    System.out.println("TESTING SILVER");
    int[][] f = {{0,0,1,-1,0},{0,0,0,-1,0},{0,0,0,0,0},{0,0,0,0,0}};
    System.out.println(Arrays.deepToString(f));
    System.out.println(USACO.silver(f,6,0,4));
  }
}
