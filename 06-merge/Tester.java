import java.util.*;
public class Tester {
  public static void main(String[] args) {
    int[] x = {38,27,43,3,9,82,10};
    int[] temp = new int[7];
    Merge.merge(x,temp,0,2);
    Merge.merge(x,temp,2,4);
    Merge.merge(x,temp,4,6);
    Merge.merge(x,temp,6,7);
    Merge.merge(temp,x,0,4);
    Merge.merge(temp,x,4,7);
    Merge.merge(x,temp,0,7);
    System.out.println(Arrays.toString(temp));
  }
}
