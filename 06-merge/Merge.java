import java.util.*;
public class Merge {
  public static void mergesort(int[] data) {
    //loop thing i don't know yet
    //calls merge(int[] data, int lo, int hi)
  }
  public static void merge(int[] data, int lo, int hi) {
    int median = (hi-lo)/2;
    if((hi-lo)%2==0) {
      int[] a = new int[median];
      int[] b = new int[median];
      for(int i = lo; i<lo+median; i++) {
        a[i-lo] = data[i];
      }
      for(int j = (lo+median); j<hi; j++) {
        b[j-(lo+median)] = data[j];
      }
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
    }
    else {
      int[] a = new int[median+1];
      int[] b = new int[median];
      for(int i = lo; i<lo+median+1; i++) {
        a[i-lo] = data[i];
      }
      for(int j = (lo+median+1); j<hi; j++) {
        b[j-(lo+median+1)] = data[j];
      }
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
    }
  }
}
