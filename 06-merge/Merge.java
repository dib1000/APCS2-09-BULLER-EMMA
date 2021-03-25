import java.util.*;
public class Merge {
  public static void mergesort(int[] data) {
    int[] temp = new int[data.length];
    for(int i = 0; i<data.length; i++) {
      temp[i] = data[i];
    }
    mergesort(data,temp,0,data.length);
  }
  public static void mergesort(int[] data, int[] temp, int lo, int hi) {
    if(hi-lo>0) {
      int median = (hi-lo)/2;
      if((hi-lo)%2==0) {
        median--;
      }
      mergesort(temp,data,lo,median+lo);
      mergesort(temp,data,median+lo+1,hi);
      if(hi<data.length) {
        merge(data,temp,lo,hi+1);
      }
      else {
        merge(data,temp,lo,hi);
      }
      System.out.println("MERGE: "+lo+" "+hi);
      System.out.println(Arrays.toString(data));
      System.out.println(Arrays.toString(temp));
    }
  }
  public static void merge(int[] data, int[] temp, int lo, int hi) {
      int median = (hi-lo)/2;
        if((hi-lo)%2!=0) {
          median++;
        }
        int ex = median+lo;
        int start = lo;
        int index = lo;
        while(index<hi) {
          if(start>=(median+lo) || ex>=hi) {
            if(start>=(median+lo)) {
              temp[index] = data[ex];
              index++;
              ex++;
            }
            else{
              temp[index] = data[start];
              index++;
              start++;
            }
        }
        else {
          if(data[start]<data[ex]) {
            temp[index] = data[start];
            index++;
            start++;
          }
          else {
            temp[index] = data[ex];
            index++;
            ex++;
          }
        }
        // System.out.println(Arrays.toString(temp));
        // System.out.println(start+" "+ex+" "+index);
      }
  }
}
