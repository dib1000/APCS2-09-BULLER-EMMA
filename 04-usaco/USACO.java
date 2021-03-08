public class USACO {
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
