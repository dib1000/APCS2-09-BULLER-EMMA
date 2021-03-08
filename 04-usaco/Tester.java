import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    int[][] lake = {{28,25,20,32,34,36},{27,25,20,20,30,34},{24,20,20,20,20,30},{20,20,14,14,20,20}};
    int[][] steps = {{1,4,4},{1,1,10}};
    // USACO.stompDig(lake,1,4,4);
    // USACO.stompDig(lake,1,1,10);
    System.out.println(USACO.bronze(lake,steps,22));
    System.out.println(Arrays.deepToString(lake));
  }
}
