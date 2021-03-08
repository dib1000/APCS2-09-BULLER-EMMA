import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class USACO {
  public static int bronze(String filename) throws FileNotFoundException {
    File f = new File(filename);
    Scanner in = new Scanner(f); //scan file
    ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>(); //storage for file info
    while(in.hasNext()) {
      String line = in.nextLine();
      Scanner l = new Scanner(line); //look through line
      ArrayList<Integer> num = new ArrayList<Integer>();
      while(l.hasNext()) { //add all ints (no spaces)
        num.add(l.nextInt()); //data seperated to certain sections
      }
      nums.add(num); //add arraylist to overall storage arraylist
    }
    int rows = nums.get(0).get(0);
    int cols = nums.get(0).get(1);
    int step = nums.get(0).get(3); //storage values for values used more than once
    int[][] lake = new int[rows][cols];
    int[][] steps = new int[step][3]; //making int[][] for function
    for(int i = 1; i<rows+1; i++) {
      for(int j = 0; j<cols; j++) {
        lake[i-1][j] = nums.get(i).get(j); //insert elevations
      }
    }
    for(int s = (rows+1); s<nums.size(); s++) {
      for(int t = 0; t<3; t++) {
        steps[s-(rows+1)][t] = nums.get(s).get(t); //insert steps
      }
    }
    return bronze(lake,steps,nums.get(0).get(2)); //do wrapper method
  }

  private static int bronze(int[][] elevations, int[][] steps, int average) {
    int sum = 0; //for the answer
    for(int s = 0; s<steps.length; s++) { //do helper method for stomp digging
      stompDig(elevations, steps[s][0], steps[s][1], steps[s][2]);
    }
    for(int r = 0; r<elevations.length; r++) {
      for(int c = 0; c<elevations[0].length; c++) {
        if(average-elevations[r][c]>0) { //check if difference is negative
          elevations[r][c] = average-elevations[r][c]; //if so, level it
        }
        else {
          elevations[r][c] = 0; //if not don't count it
        }
        sum+=elevations[r][c]; //add to sum
      }
    }
    return sum*72*72; //answer
  }

  private static void stompDig(int[][] elevations, int row, int col, int dig) {
    int max = 0; //find max value, cows will only dig once they match with the max value
    for(int i = row-1; i<row+2; i++) {
      for(int j = col-1; j<col+2; j++) {
        if(elevations[i][j]>max) {
          max = elevations[i][j]; //cycle through data to find max
        }
      }
    }
    for(int r = row-1; r<row+2; r++) {
      for(int c = col-1; c<col+2; c++) {
        if(max-elevations[r][c]<dig) { //if difference is smaller than dig value, then you can dig
          elevations[r][c] = elevations[r][c] - (dig-(max-elevations[r][c])); //only dig the amount the dogs will
        }
      }
    }
  }


  public static long silver(long[][] field, int sec, int endRow, int endCol) {
    for(int i = 0; i<sec; i++) {
      ArrayList<Integer> vals = new ArrayList<Integer>();
      for(int r = 0; r<field.length; r++) {
        for(int c = 0; c<field[0].length; c++) {
          if(field[r][c]>0) {
            vals.add(r);
            vals.add(c);
          }
        }
      }
        System.out.println(vals);
        while(vals.size()>0) {
          addNeighbor(field,vals.get(0),vals.get(1));
          vals.remove(0);
          vals.remove(0);
        }
      }
      return field[endRow][endCol];
    }

  public static void addNeighbor(long[][] field, int row, int col) {
    if(row+1<field.length) {
      if(field[row+1][col]>=0) {
        field[row+1][col] += field[row][col];
      }
    }
    if(row-1>-1) {
      if(field[row-1][col]>=0) {
        field[row-1][col] += field[row][col];
      }
    }
    if(col+1<field[0].length) {
      if(field[row][col+1]>=0) {
        field[row][col+1] += field[row][col];
      }
    }
    if(col-1>-1) {
      if(field[row][col-1]>=0) {
        field[row][col-1] += field[row][col];
      }
    }
    field[row][col] = 0;
  }
}
