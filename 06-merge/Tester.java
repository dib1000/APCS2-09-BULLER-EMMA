import java.util.*;
public class Tester {
  public static void main(String[] args) {
    int[] x = {38,27,43,3,10,82,9};
    int[] temp = new int[7];
    // Merge.merge(x,temp,0,2);
    // Merge.merge(x,temp,2,4);
    // Merge.merge(x,temp,4,6);
    // Merge.merge(x,temp,6,7);
    // Merge.merge(temp,x,0,4);
    // Merge.merge(temp,x,4,7);
    // Merge.merge(x,temp,0,7);
    Merge.mergesort(x);
    System.out.println(Arrays.toString(x));
    // System.out.println(2==2.0);
    // System.out.println(1==1.65545345);
    // int[] equal = {1,1,1,1};
    // int[] t = new int[4];
    // Merge.merge(equal,t,0,2);
    // System.out.println(Arrays.toString(t));
    int[] reverse = {10,9,8,7,6,4,3,2,1};
    Merge.mergesort(reverse);
    System.out.println(Arrays.toString(reverse));
    // int[] big = new int[10000000];
    // for(int i = 0; i<big.length; i++) {
    //   big[i] = (int)Math.random() * 100;
    // }
    // long start = System.currentTimeMillis();
    // Merge.mergesort(big);
    // double quickTime = (System.currentTimeMillis()-start)/1000.0;
    // System.out.println(quickTime);
  }
}
