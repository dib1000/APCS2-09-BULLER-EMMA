import java.util.*;
public class Merge {
  public static void mergesort(int[] data) {
    //loop thing i don't know yet
    //calls merge(int[] data, int lo, int hi)
  }
  public static void merge(int[] data, int[] temp, int lo, int hi) {
      int median = (hi-lo)/2;
      if(median>0) {
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
        System.out.println(Arrays.toString(temp));
        System.out.println(start+" "+ex+" "+index);
        //System.out.println(data[start]+" "+data[ex]);
      }
    }
    else {
      temp[lo] = data[lo];
    }
  }
}
