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
      for(int i = lo; i<median; i++) {
        a[i] = data[i];
      }
      for(int j = median; j<hi; j++) {
        b[j] = data[j];
      }
    }
    else {
      int[] a = new int[median+1];
      int[] b = new int[median];
      for(int i = lo; i<median; i++) {
        a[i] = data[i];
      }
      for(int j = median; j<hi; j++) {
        b[j] = data[j];
      }
    }
  }
}
