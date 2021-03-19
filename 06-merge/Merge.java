import java.util.*;
public class Merge {
  public static void mergesort(int[] data) {
    int[] temp = new int[data.length];
    int pair = 2;
    int swaps = 1;
    int howMany = ((int)(Math.log(data.length)/Math.log(2)))+1;
    while((Math.log(pair)/Math.log(2))<=howMany) {
      // System.out.println(pair);
      // System.out.println(swaps);
      if(swaps%2!=0) {
        for(int i = 0; i<data.length; i+=pair) {
          if(i+pair<data.length) {
            merge(data,temp,i,i+pair);
          }
          else {
            //System.out.println("WE DID IT");
            merge(data,temp,i,data.length);
          }
        }
      }
      else {
        for(int i = 0; i<data.length; i+=pair) {
          if(i+pair<data.length) {
            merge(temp,data,i,i+pair);
          }
          else {
            merge(temp,data,i,data.length);
          }
        }
      }
      swaps++;
      pair = pair * 2;
    }
    if(swaps%2==0) {
      for(int i = 0; i<data.length; i++) {
        data[i] = temp[i];
      }
    }
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
