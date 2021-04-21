import java.util.*;
public class Merge {
  public static void mergesort(int[] data) {
    int[] temp = new int[data.length];
    for(int i = 0; i<data.length; i++) {
      temp[i] = data[i];
    }
    mergesort(data,temp,0,data.length-1);
    for(int j = 0; j<data.length; j++) {
      data[j] = temp[j];
    }
  }
  public static void mergesort(int[] data, int[] temp, int lo, int hi) {
    if(lo<hi) {
      int median = (hi-lo)/2 + lo;
      mergesort(temp,data,lo,median);
      mergesort(temp,data,median+1,hi);
      merge(data,temp,lo,hi);
    }
  }
  public static void merge(int[] data, int[] temp, int lo, int hi) {
    int median = lo + (hi-lo)/2;
    int start = lo;
    int end = median + 1;
    int index = lo;

    while(start<median+1 && end<hi+1) {
      if(data[start] <= data[end]) {
        temp[index] = data[start];
        start++;
      }
      else {
        temp[index] = data[end];
        end++;
      }
      index++;
    }

    while(start<median+1) {
      temp[index] = data[start];
      start++;
      index++;
    }

    while(end<hi+1) {
      temp[index] = data[end];
      end++;
      index++;
    }
  }
}
