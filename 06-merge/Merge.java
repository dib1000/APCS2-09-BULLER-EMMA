import java.util.*;
public class Merge {
  public static void mergesort(int[] data) {
    int[] temp = new int[data.length];
    mergesort(data,temp,0,data.length);
    int swipe = 0;
    if((int)(Math.log(data.length)/Math.log(2)) == (Math.log(data.length)/Math.log(2))) {
      swipe = (int)(Math.log(data.length)/Math.log(2));
    }
    else {
      swipe = (int)(Math.log(data.length)/Math.log(2)) + 1;
    }
    if(swipe%2!=0) {
      for(int i = 0; i<data.length; i++) {
        data[i] = temp[i];
      }
    }
  }
  public static void mergesort(int[] data, int[] temp, int lo, int hi) {
    int level = 0;
    int x = hi;
    if(lo==0 && (hi-lo)!=1) {
      x+=1;
    }
    if((int)(Math.log(x-lo)/Math.log(2)) == (Math.log(x-lo)/Math.log(2)) && (hi-lo)>1) {
      level = (int)(Math.log(x-lo)/Math.log(2));
    }
    else {
      level = (int)(Math.log(x-lo)/Math.log(2)) + 1;
    }
    if(hi-lo>0) {
      int median = (hi-lo)/2;
      if(((hi-lo)%2==0 &&(hi-lo)!=2)) {
        median-=1;
      }
      System.out.println(lo+" "+median+" "+hi);
      mergesort(data,temp,lo,median+lo);
      mergesort(data,temp,median+lo+1,hi);
      System.out.println("LEVEL: " + level);
      if(hi==data.length) {
        if(level%2==1) {
          merge(data,temp,lo,hi);
        }
        else {
          merge(temp,data,lo,hi);
        }
      }
      else {
        if(level%2==1) {
          merge(data,temp,lo,hi+1);
        }
        else {
          merge(temp,data,lo,hi+1);
        }
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
