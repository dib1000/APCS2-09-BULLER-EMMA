import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class USACO {
  public static int bronze(String filename) throws FileNotFoundException {
    File f = new File(filename);
    Scanner in = new Scanner(f);
    ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>();
    while(in.hasNext()) {
      String line = in.nextLine();
      Scanner l = new Scanner(line);
      ArrayList<Integer> num = new ArrayList<Integer>();
      while(l.hasNext()) {
        num.add(l.nextInt());
      }
      nums.add(num);
    }
    int rows = nums.get(0).get(0);
    int cols = nums.get(0).get(1);
    int step = nums.get(0).get(3);
    int[][] lake = new int[rows][cols];
    int[][] steps = new int[step][3];
    for(int i = 1; i<rows+1; i++) {
      for(int j = 0; j<cols; j++) {
        lake[i-1][j] = nums.get(i).get(j);
      }
    }
    for(int s = (rows+1); s<nums.size(); s++) {
      for(int t = 0; t<3; t++) {
        steps[s-(rows+1)][t] = nums.get(s).get(t);
      }
    }
    System.out.println(Arrays.deepToString(lake));
    System.out.println(Arrays.deepToString(steps));
    return 1;
  }
  public static int bronze(int[][] elevations, int[][] steps, int average) {
    int sum = 0;
    for(int s = 0; s<steps.length; s++) {
      stompDig(elevations, steps[s][0], steps[s][1], steps[s][2]);
    }
    for(int r = 0; r<elevations.length; r++) {
      for(int c = 0; c<elevations[0].length; c++) {
        if(average-elevations[r][c]>0) {
          elevations[r][c] = average-elevations[r][c];
        }
        else {
          elevations[r][c] = 0;
        }
        sum+=elevations[r][c];
      }
    }
    return sum*72*72;
  }

  public static void stompDig(int[][] elevations, int row, int col, int dig) {
    int max = 0;
    for(int i = row-1; i<row+2; i++) {
      for(int j = col-1; j<col+2; j++) {
        if(elevations[i][j]>max) {
          max = elevations[i][j];
        }
      }
    }
    for(int r = row-1; r<row+2; r++) {
      for(int c = col-1; c<col+2; c++) {
        if(max-elevations[r][c]<dig) {
          elevations[r][c] = elevations[r][c] - (dig-(max-elevations[r][c]));
        }
      }
    }
  }
}
