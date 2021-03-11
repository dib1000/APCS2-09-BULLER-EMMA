import java.util.*;
public class Preliminary {
  public static int partition(int[] data, int start, int end) {
    if(start==end) {
      return start;
    }
    int mid = (end-start)/2 + start;
    int pivot = 0;
    if((data[start]<=data[mid] && data[mid]<=data[end]) || (data[start]>=data[mid] && data[mid]>=data[end])) {
      pivot = mid;
    }
    else if ((data[start]>=data[mid] && data[start]<=data[end]) || (data[start]<=data[mid] && data[start]>=data[end])) {
      pivot = start;
    }
    else {
      pivot = end;
    }
    int storage = data[pivot];
    data[pivot] = data[start];
    data[start] = storage;
    System.out.println(Arrays.toString(data));
    int current = start+1;
    int greater = end;
    while(current<greater) {
      if(data[current]<data[start]) {
        current+=1;
      }
      else if(data[current]>data[start]) {
        int swap = data[greater];
        data[greater] = data[current];
        data[current] = swap;
        greater-=1;
      }
      else {
        double ran = Math.random();
        if(ran<=0.5) {
          current+=1;
        }
        else {
          int swaps = data[greater];
          data[greater] = data[current];
          data[current] = swaps;
          greater-=1;
        }
      }
    }
    System.out.println(Arrays.toString(data));
    int vStart = data[start];
    if(data[start]<data[current]) {
      current-=1;
      data[start] = data[current];
      data[current] = vStart;
    }
    else if(data[start]>data[current]) {
      data[start] = data[current];
      data[current] = vStart;
    }
    else {
      if(Math.random()<=0.5) {
        current -= 1;
        data[start] = data[current];
        data[current] = vStart;
      }
      else {
        data[start] = data[current];
        data[current] = vStart;
      }
    }
    System.out.println(Arrays.toString(data));
    return current;
   }
}
