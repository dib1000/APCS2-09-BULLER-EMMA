public class USACO {
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
