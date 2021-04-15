import java.util.*;
public class frontierTester {
  public static void main(String[] args) {
    Frontier x = new Frontier();
    Frontier n = new Frontier(10000);
    System.out.println(x.size());
    System.out.println(n.size());
    int[] add = {3,4};
    n.add(add);
    System.out.println(n.size());
    int[] see = n.remove();
    System.out.println(Arrays.toString(see));
  }
}
